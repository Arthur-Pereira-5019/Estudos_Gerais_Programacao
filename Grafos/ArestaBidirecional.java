public class ArestaBidirecional extends Aresta{
    public ArestaBidirecional(Vertice<?,?> vertice1, Vertice<?,?> vertice2) {
        super(vertice1,vertice2);
    }

    public Vertice<?,?> outraPonta(Vertice<?,?> v) {
        if(vertice1 == v) {
            return vertice2;
        } else if(vertice2 == v) {
            return vertice1;
        }
        return null;
    }
}
