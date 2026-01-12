package repaso_examen;

public class EJ1_Matrices {
    public static void main(String[] args) {

        // 1. CREAMOS EL HOTEL (5 pisos, 5 habitaciones)
        int[][] matriz = new int[10][2];

        int cont = 1; // Contador del 1 al 25

        // 2. RELLENAR (Doble Bucle)
        for (int i = 0; i < matriz.length; i++) {       // Recorre filas (0 a 4)
            for (int j = 0; j < matriz[i].length; j++) { // Recorre columnas (0 a 4)
                matriz[i][j] = cont;
                cont++; // Pasamos al siguiente número
            }
        }

        // 3. MOSTRAR (Doble Bucle)
        System.out.println("--- MI MATRIZ 5x5 ---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t"); // \t separa los números
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}