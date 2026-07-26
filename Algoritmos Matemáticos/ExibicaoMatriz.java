public class ExibicaoMatriz {
    public static void exibir(Object[][] M,int n1, int n2) {
        for(int i = 0; i < n1; i++) {
            String ex = "";
            for(int j = 0; j < n2; j++) {
                ex += M[i][j] + " ";
            }
            System.out.println(ex);
        }
    }
}
