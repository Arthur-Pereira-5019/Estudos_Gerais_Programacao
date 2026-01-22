public class ArestaBidirecional<Vertice> {
    private Vertice vertice1;
    private Vertice vertice2;

    public ArestaBidirecional(Vertice vertice1, Vertice vertice2) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
    }

    public Vertice outraPonta(Vertice v) {
        if(vertice1 == v) {
            return vertice2;
        } else if(vertice2 == v) {
            return vertice1;
        }
        return null;
    }

    public void setVertice1(Vertice vertice1) {
        this.vertice1 = vertice1;
    }

    public void setVertice2(Vertice vertice2) {
        this.vertice2 = vertice2;
    }
}
