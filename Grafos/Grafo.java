import java.util.ArrayList;
import java.util.List;

public class Grafo<Dado,Identificador> {
    private ArrayList<? extends Aresta> arestas;
    private ArrayList<Vertice<Dado, Identificador>> vertices = new ArrayList<>();

    public void addVertice(Vertice<Dado, Identificador> v) {
        vertices.add(v);
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
        
    }

    public Vertice<?,?> procurarVerticePeloId(Identificador id) {
        for(Vertice<?,?> v: vertices) {
            if(v.getId() == id) {
                return v;
            }
        }
        return null;
    }

    public static <D, I> Grafo<?, ?> novoGrafoUnidirecional(D dado, I id) {
        Grafo<?, ?> g = new Grafo<D, I>();
        g.arestas = new ArrayList<ArestaUnidirecional>();
        return g;
    }

    public static <D, I, P> Grafo<?, ?> novoGrafoUnidirecionalComPeso(D dado, I id, P peso) {
        Grafo<?, ?> g = new Grafo<D, I>();
        g.arestas = new ArrayList<ArestaUnidirecionalComPeso<P>>();
        return g;
    }

    public static <D, I> Grafo<?, ?> novoGrafoBidirecional(D dado, I id) {
        Grafo<?, ?> g = new Grafo<D, I>();
        g.arestas = new ArrayList<ArestaBidirecional>();
        return g;
    }

    public static <D, I, P> Grafo<?, ?> novoGrafoBidirecionalComPeso(D dado, I id, P peso) {
        Grafo<?, ?> g = new Grafo<D, I>();
        g.arestas = new ArrayList<ArestaBidirecionalComPeso<P>>();
        return g;
    }
}