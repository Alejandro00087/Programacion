package repaso_examen;

public class EJ4_Matrices {
    public static void main(String[] args) {

        int numeros [][] = new int [3][3];

        // 1. RELLENAR (Esto lo tenías PERFECTO)
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                numeros[i][j] = i * j;
            }
        }

        // 2. MOSTRAR (Aquí estaba el fallo: hay que usar otro for para imprimir)
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                // Imprimimos el número seguido de un espacio
                System.out.print(numeros[i][j] + " ");
            }
            // Cuando acaba una fila, saltamos a la siguiente línea
            System.out.println();
        }
    }
}