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

        System.out.println("Diga o valor v a ser fatorado, tal que v E I; v > 1");
        v = s.nextInt();

        //Gerar os valores testáveis
        for (int i = 2; i <= v; i++) {
            t.add(i);
        }

        //Aplicar o crivo
        while(t.size() > 0) {
            int m = t.get(0);
            e.add(m);
            for (int j = 0; j < t.size(); j++) {
                System.out.println(t.get(j));
                if (t.get(j) % m == 0) {
                    t.remove(j);
                }
            }
        }

        System.out.println(e);

        //Fatorar
        boolean fatorado = false;
        while (!fatorado) {
            if (v == 1) {
                fatorado = true;
            }
            for (int i = 0; e.get(i) <= v; i++) {
                if (v % e.get(i) == 0) {
                    f.add(e.get(i));
                    v /= e.get(i);
                    i--;
                }
                if (e.size() == i + 1) {
                    break;
                }
                fatorado = true;
            }

            //Mostrar resultado
            System.out.println("Os fatores são:");
            for (Integer a : f) {
                System.out.println(a);
            }

        }
    }
}
