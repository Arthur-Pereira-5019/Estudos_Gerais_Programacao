import exception.VerticeDuplicado;

import java.util.ArrayList;
import java.util.List;

public class Grafo<Dado,Identificador,Peso> {
    private TipoGrafo tipoGrafo;
    private ArrayList<? extends Aresta> arestas;
    private ArrayList<Vertice<Dado, Identificador>> vertices = new ArrayList<>();

    private Grafo(TipoGrafo tg) {
        switch (tg) {
            case ARESTA_BIDIRECIONAL:
                arestas = new ArrayList<ArestaBidirecional>();
                break;
            case ARESTA_BIDIRECIONAL_COM_PESO:
                arestas = new ArrayList<ArestaBidirecionalComPeso<Peso>>();
                break;
            case ARESTA_UNIDIRECIONAL:
                arestas = new ArrayList<ArestaUnidirecional>();
                break;
            case ARESTA_UNIDIRECIONAL_COM_PESO:
                arestas = new ArrayList<ArestaUnidirecionalComPeso<Peso>>();
                break;
        }
        tipoGrafo = tg;
    }

    public void addVertice(Vertice<Dado, Identificador> v) {
        if(procurarVerticePeloId(v.getId()) == null) {
            vertices.add(v);
        } else {
            throw new VerticeDuplicado("Vértice já existente com id " + v.getId());
        }
    }

    public ArrayList<Vertice<Dado, Identificador>> getVertices() {
        return vertices;
    }

    public ArrayList<? extends Aresta> getArestas() {
        return arestas;
    }

    public void conectar(Identificador i1, Identificador i2) {
        Vertice v1 = procurarVerticePeloId(i1);
        Vertice v2 = procurarVerticePeloId(i2);
        Aresta a;
        if(tipoGrafo == TipoGrafo.ARESTA_BIDIRECIONAL) {
            a = new ArestaBidirecional(v1,v2);
        } else if(tipoGrafo == TipoGrafo.ARESTA_UNIDIRECIONAL_COM_PESO) {
            a = new ArestaBidirecional(v1,v2);
        } else if(tipoGrafo == TipoGrafo.ARESTA_UNIDIRECIONAL) {
            a = new ArestaBidirecional(v1,v2);
        } else  {
            a = new ArestaBidirecional(v1,v2);
        }
        addToList(arestas,a);
    }

    private <T extends Aresta> void addToList(List<T> list, T item) {
        list.add(item);
    }

    public Vertice<?,?> procurarVerticePeloId(Identificador id) {
        for(Vertice<?,?> v: vertices) {
            if(v.getId() == id) {
                return v;
            }
        }
        return null;
    }

}