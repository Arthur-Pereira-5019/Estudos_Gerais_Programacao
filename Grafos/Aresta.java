public abstract class Aresta {

    public Aresta(Vertice<?,?> vertice1, Vertice<?,?> vertice2) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
    }

    protected Vertice<?,?> vertice1;
    protected Vertice<?,?> vertice2;

    public abstract Vertice<?,?> outraPonta(Vertice<?,?> v);

    public void setVertice1(Vertice<?,?> vertice1) {
        this.vertice1 = vertice1;
    }

    public void setVertice2(Vertice<?,?> vertice2) {
        this.vertice2 = vertice2;
    }
}
