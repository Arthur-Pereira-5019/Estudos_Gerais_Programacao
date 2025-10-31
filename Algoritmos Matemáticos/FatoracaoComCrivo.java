import java.util.ArrayList;
import java.util.Scanner;

public class FatoracaoComCrivo {
    public static void main(String[] args) {
        //Limite
        int l;
        //Valor
        int v;
        //Encontrados
        ArrayList<Integer> e = new ArrayList<>();
        //Testáveis
        ArrayList<Integer> t = new ArrayList<>();
        //Fatores
        ArrayList<Integer> f = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        System.out.println("Diga o valor a ser fatorado");
        v = s.nextInt();

        //Não vai haver divisor inteiro maior que metade do número, se não o próprio número.
        l = v/2;

        //Gerar os valores testáveis
        for(int i=0; i<l;i++) {
            t.add(i);
        }


        //Aplicar o crivo
        for(int i=2; i<t.size();i++) {
            int m = t.get(i);
            e.add(m);
            for(int j=m;j<t.size();j++) {
                if(t.get(j) % m == 0) {
                    t.remove(j);
                }
            }
        }

        for(Integer g: e) {
            System.out.println(g);
        }

        //Fatorar
        boolean fatorado = false;
        while(!fatorado) {
            if(v == 1) {
                fatorado = true;
            }
            for(int i = 0; e.get(i) < v/2; i++) {
                if(v % e.get(i) == 0) {
                    f.add(e.get(i));
                    v /= e.get(i);
                    i--;
                }
            }
            fatorado = true;
        }

        //Mostrar resultado
        for(Integer a: f) {
            System.out.println(a);
        }

    }
}
