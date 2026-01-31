import java.lang.reflect.Field;
import java.util.Objects;

public class Vertice<Dado,Identificador> {

    private Dado dado;
    private Identificador id;

    public Vertice(Dado dado, Identificador id) {
        this.dado = dado;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Vertice<?,?>) {
            return id == ((Vertice<?, ?>) o).id;
        }
        return false;
    }

    public Dado getDado() {
        return dado;
    }

    public void setDado(Dado dado) {
        this.dado = dado;
    }

    public Identificador getId() {
        return id;
    }

    public void setId(Identificador id) {
        this.id = id;
    }
}
