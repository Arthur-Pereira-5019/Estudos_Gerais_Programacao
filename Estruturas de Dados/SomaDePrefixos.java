import java.util.Scanner;

public class SomaDePrefixos {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] valores = new int[n+1];
        int[] prefixos = new int[n+1];
        for (int i = 0; i <= n; i++) {
            valores[i] = i;
        }
        prefixos[0] += 1;
        for (int i = 1; i <= n; i++) {
            prefixos[i] = valores[i] + prefixos[i-1];
        }
        while (true) {
            System.out.println("Começo da soma");
            int i = scanner.nextInt();
            System.out.println("Final da soma");
            int f = scanner.nextInt();
            if(i == f && f == 0) {
                break;
            }
            int s = prefixos[f] - prefixos[i];
            System.out.println("Resultado = "+s);
        }


    }
}
