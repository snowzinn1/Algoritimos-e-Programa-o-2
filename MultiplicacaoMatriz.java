public class MultiplicacaoMatriz {
    public static void main(String[] args) {

        int[][] a = {
                {1,2},
                {3,4}
        };
        int[][] b = {
                {1,2},
                {3,4}
        };

        int linhas = a.length;
        int colunas = b[0].length;

        int[][] c = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                for (int k = 0; k < linhas ; k++) {
                    c[i][j] += a[i][k] * b[k][j];

                }

            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
