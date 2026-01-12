package repaso_examen;

public class EJ3_Matrices {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (i == j) matriz[i][j] = 1;
                else matriz[i][j] = 0;

                System.out.printf(matriz[i][j] + " \t ");
            }
            System.out.println();
        }
    }
}
