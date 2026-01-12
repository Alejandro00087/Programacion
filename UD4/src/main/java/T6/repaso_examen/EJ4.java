package repaso_examen;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {

        int numeros[] = new int[20];// Creamos array de 20
        Scanner sc = new Scanner(System.in);

        // 1. Pedir los datos
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // 2. Variables para acumular las sumas
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        // 3. Recorrer el array y clasificar
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i]; // Si es positivo, a su saca
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i]; // Si es negativo, a la otra
            }
        }

        // 4. Mostrar resultados [cite: 13]
        System.out.println("Suma de positivos: " + sumaPositivos);
        System.out.println("Suma de negativos: " + sumaNegativos);
    }
}