package repaso_examen;

import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Creamos el array de 10 enteros (al principio estará todo a 0)
        int[] numeros = new int[10];

        // Variable para guardar la letra que elija el usuario
        char opcion;

        // 2. Empezamos el bucle del menú
        do {
            // Imprimimos el menú bonito
            System.out.println("\n--- MENÚ ---");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Elige una opción: ");

            // Leemos la letra (usamos next().charAt(0) para leer un carácter)
            opcion = sc.next().charAt(0);

            // 3. Evaluamos qué ha elegido el usuario
            switch (opcion) {
                case 'a': // OPCIÓN A: MOSTRAR
                    System.out.println("Valores del array:");
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.print(numeros[i] + " ");
                    }
                    System.out.println(); // Salto de línea al final
                    break;

                case 'b': // OPCIÓN B: INTRODUCIR VALOR
                    System.out.print("Dime el valor (V) que quieres meter: ");
                    int v = sc.nextInt();

                    System.out.print("Dime en qué posición (P) del 0 al 9: ");
                    int p = sc.nextInt();

                    // TRUCO: Comprobar que la posición P es válida para que no explote
                    if (p >= 0 && p < 10) {
                        numeros[p] = v; // Aquí es donde guardamos V en el cajón P
                        System.out.println("Guardado correctamente.");
                    } else {
                        System.out.println("¡Error! La posición debe ser entre 0 y 9.");
                    }
                    break;

                case 'c': // OPCIÓN C: SALIR
                    System.out.println("¡Adiós!");
                    break;

                default: // SI SE EQUIVOCA DE LETRA
                    System.out.println("Opción no válida. Prueba otra vez.");
            }

        } while (opcion != 'c'); // El bucle se repite MIENTRAS la opción NO sea 'c'
    }
}