public class Main {
    static void main() {
        Grafo<Integer,Integer> g = Grafo.builder(Integer.class,4, Integer.class).preenchidoCom(0).build();
        g.conectar(0,1,true,7);
        g.conectar(1,3,false,2);
        g.conectar(3,2,true,3);
        g.conectar(1,1,false,1);
        System.out.println(g);
    }
}
