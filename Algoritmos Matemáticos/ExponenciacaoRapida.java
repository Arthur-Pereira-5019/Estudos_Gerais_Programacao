import java.util.Scanner;

public class ExponenciacaoRapida {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int base;
        int expoente;

        /*
        O algoritmo é baseado em recursão e utiliza do fato que é possível decompor exponenciações
        em outras exponenciações menores seguindo as regras descritas abaixo.


        x^n = 1 (Exceto quando x é 0) se n é 0;
        x^n =x^(n/2))^2 se n for par.
        x^n = (x^(n-1/2))^2) * n se n for ímpar.
*/
        System.out.println("Para calcular utilizando exponenciação rápida, digite a base");
        base = s.nextInt();
        System.out.println("Agora, digite o expoente");
        expoente = s.nextInt();

        System.out.println("O resultado é: "+exp(base, expoente));
    }



    static int exp(int base, int expoente) {
        //Caso o expoente seja 0.
        if(expoente == 0) {
            if(base == 0) {
                throw new ArithmeticException("0 elevado a 0 é indefinido");
            }
            return 1;
        }

        //Chama a recursão até chegarmos no menor expoente possível, ou seja, 0, retornando a própria base
        int temp = exp(base, expoente /2);

        //Caso par
        if(expoente % 2 != 0) {
            return base *temp*temp;
        }

        //Por fim, caso ímpar
        return temp*temp;

    }
}
