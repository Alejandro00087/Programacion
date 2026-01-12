package repaso_examen;

import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Declaramos el array para 20 números reales (double)
        double[] numeros = new double[20];

        // 2. Variable para ir guardando la suma total
        double suma = 0;

        // 3. Bucle para leer los 20 números
        System.out.println("Introduce 20 números reales:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble(); // Guardamos el dato en el array
        }

        // 4. Bucle para recorrer el array y sumar los valores
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i]; // Sumamos el valor de cada posición a nuestra variable suma
        }

        // 5. Calculamos la media dividiendo la suma por el total de elementos (20)
        double media = suma / numeros.length;

        // 6. Mostramos los resultados
        System.out.println("La suma total es: " + suma);
        System.out.println("La media aritmética es: " + media);
    }
}