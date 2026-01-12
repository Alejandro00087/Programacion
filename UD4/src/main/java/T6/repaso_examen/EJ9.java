package repaso_examen;

import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Creamos el array de enteros con tamaño 100
        int[] numeros = new int[100];

        // 2. Lo rellenamos con números aleatorios entre 1 y 10
        // Usamos la fórmula: (int) (1 + Math.random() * 10)
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (1 + Math.random() * 10);
        }

        // 3. Pedimos al usuario el valor N a buscar
        System.out.print("Introduce un número entero (N) para buscar sus posiciones: ");
        int n = sc.nextInt();

        // 4. Recorremos el array para encontrar en qué posiciones está N
        System.out.println("El valor " + n + " se encuentra en las siguientes posiciones:");

        boolean encontrado = false; // Variable extra para avisar si no está
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {
                // IMPORTANTE: Imprimimos la 'i', que es la posición
                System.out.print(i + " ");
                encontrado = true;
            }
        }

        // Si no se ha encontrado ninguna vez, avisamos
        if (!encontrado) {
            System.out.print("Ninguna.");
        }

        System.out.println(); // Salto de línea final
    }
}