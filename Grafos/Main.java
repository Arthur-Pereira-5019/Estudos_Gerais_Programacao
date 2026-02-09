public class Main {
    static void main() {
        Grafo<String, String> g = new Grafo<>();
        g.addVertice(new Vertice<>("0","0"));
        g.addVertice(new Vertice<>("0","1"));
        g.conectar("0","1");
    }
}
