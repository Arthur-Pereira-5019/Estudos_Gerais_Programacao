public class ArestaUnidirecionalComPeso<Peso> extends ArestaUnidirecional {
    Peso peso;
    public ArestaUnidirecionalComPeso(Vertice<?,?> vertice1, Vertice<?,?> vertice2, Peso peso) {
        super(vertice1, vertice2);
        this.peso = peso;
    }

    public Peso getPeso() {
        return peso;
    }

    public void setPeso(Peso peso) {
        this.peso = peso;
    }
}
