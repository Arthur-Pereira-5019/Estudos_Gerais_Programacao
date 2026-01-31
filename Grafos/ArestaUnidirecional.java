public class ArestaUnidirecional extends Aresta {

    public ArestaUnidirecional(Vertice<?,?> vertice1, Vertice<?,?> vertice2) {
        super(vertice1, vertice2);
    }

    public Vertice<?,?> outraPonta(Vertice<?,?> v) {
        return vertice2;
    }
}
