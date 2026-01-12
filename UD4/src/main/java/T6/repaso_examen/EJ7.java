package repaso_examen;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos los límites
        System.out.print("Introduce el inicio (P): ");
        int p = sc.nextInt();
        System.out.print("Introduce el fin (Q): ");
        int q = sc.nextInt();

        // Creamos el array con el tamaño justo
        int tamanyo = (q - p) + 1;
        int[] numeros = new int[tamanyo];

        // Rellenamos el array
        for (int i = 0; i < numeros.length; i++) {
            // En la primera vuelta (i=0), guardamos P
            // En la segunda (i=1), guardamos P+1...
            numeros[i] = p + i;
        }

        // Lo mostramos
        System.out.println("El array contiene:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}