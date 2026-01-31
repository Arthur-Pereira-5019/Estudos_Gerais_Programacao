public class GrafoBuilder {
    private Grafo<?,?> grafo;

    public GrafoBuilder createGrafo() {
        grafo = new Grafo<>();
        return this;
    }

    public Grafo<?,?> build() {
        return grafo;
    }
}
