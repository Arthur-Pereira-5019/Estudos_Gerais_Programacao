import java.util.Scanner;

public class BareissAlgorithm {
    public static Float[][] compute(Float[][] M) {
        M[0][0] = 1F;
        int n = M.length;
        for(int k = 1; k < n; k++) {
            for(int i = k+1; i < n; i++) {
                for(int j = k+1; j < n; j++) {
                    M[i][j] = ((M[i][j]*M[k][k]) - (M[i][k]*M[k][j]))/M[k-1][k-1];
                    M[i][k] = 0F;
                }
            }
        }
        return M;
    }

    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Dimensão da matriz: ");
        int n = s.nextInt();
        Float[][] M = new Float[n][n];
        s.nextLine();
        for(int i = 0; i < n; i++) {
            System.out.println("Linha: "+(i-(-1)));
            String l = s.nextLine();
            String[] ll = l.split(" ");
            Float[] lf = new Float[n];
            int k = 0;
            for(k = 0; k < n; k++) {
                lf[k] = Float.parseFloat(ll[k]);
            }
            M[i] = lf;
        }
        ExibicaoMatriz.exibir(M,n,n);
        ExibicaoMatriz.exibir(compute(M), n, n);
    }
}
