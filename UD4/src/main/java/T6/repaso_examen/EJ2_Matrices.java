package repaso_examen;

public class EJ2_Matrices {
    public static void main(String[] args) {

        int[][] matriz = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                // 1. PRIMERO CALCULAMOS Y GUARDAMOS
                matriz[i][j] = i * j;

                // 2. LUEGO IMPRIMIMOS (Usamos print y \t para que salga a lo ancho)
                System.out.print(matriz[i][j] + "\t");
            }
            // 3. SALTO DE LÍNEA (Al acabar cada fila)
            System.out.println();
        }
    }
}