import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Grafo<T,I> {
    private T[][] matrizDeAdjacencia;
    private Class<T> tipo;
    private Map<I, Integer> identificadores = new HashMap<>();

    public Grafo(GrafoBuilder<T,I> builder) {
        tipo = builder.getTipo();
        matrizDeAdjacencia = builder.getMatrizDeAdjacencia();
    }

    public void conectar(int id1, int id2, boolean bidirecional, T peso) {
        if(id1 > matrizDeAdjacencia.length | id2 > matrizDeAdjacencia.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        matrizDeAdjacencia[id1][id2] = peso;
        if(bidirecional) {
            matrizDeAdjacencia[id2][id1] = peso;
        }
    }
    
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        int length = matrizDeAdjacencia.length;
        for(int i = 0; i < length;i++) {
            for(int j = 0; j < length; j++) {
                resultado.append(" ").append(matrizDeAdjacencia[i][j]);
            }
            resultado.append("\n");
        }
        return resultado.toString();
    }

    public static <t,id> GrafoBuilder<t,id> builder(Class<t> tipo, int tamanho, Class<id> identificador) {
        return new GrafoBuilder<t,id>(tipo, tamanho, identificador);
    }

    public static class GrafoBuilder<T,I> {
        private T[][] matrizDeAdjacencia;
        private Class<T> tipo;
        private Class<I> identificador;
        private Map<I, Integer> identificadores = new HashMap<>();

        public GrafoBuilder(Class<T> tipo, int s, Class<I> identificador) {
            this.tipo = tipo;
            this.identificador = identificador;
            matrizDeAdjacencia = (T[][]) Array.newInstance(tipo, s, s);
        }

        public Grafo<T, I> build() {
            return new Grafo<>(this);
        }

        public T[][] getMatrizDeAdjacencia() {
            return matrizDeAdjacencia;
        }

        public void setMatrizDeAdjacencia(T[][] matrizDeAdjacencia) {
            this.matrizDeAdjacencia = matrizDeAdjacencia;
        }

        public Class<T> getTipo() {
            return tipo;
        }

        public void setTipo(Class<T> tipo) {
            this.tipo = tipo;
        }

        public GrafoBuilder<T, I> preenchidoCom(T objeto) {
            for (int i = 0; i < matrizDeAdjacencia.length; i++) {
                for (int j = 0; j < matrizDeAdjacencia.length; j++) {
                    matrizDeAdjacencia[i][j] = objeto;
                }
            }
            return this;
        }

        public GrafoBuilder<T,I> tentarGerarIdentificacao() {
            if(tipo.equals(Integer.class)) {
                for(Integer i = 0; i < matrizDeAdjacencia.length; i++) {
                    identificadores.put((I) i,i);
                }
            }

            return this;
        }
    }
}
