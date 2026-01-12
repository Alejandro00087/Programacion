package repaso_examen;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        double numeros[] = new double[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime un número:");
            numeros[i] = sc.nextDouble();
        }

        // TRUCO DE EXAMEN:
        // Inicializamos con el primer elemento que introdujo el usuario
        double maximo = numeros[0];
        double minimo = numeros[0];

        for (int i = 1; i < numeros.length; i++) { // Empezamos en 1 porque el 0 ya lo tenemos
            maximo = Math.max(numeros[i], maximo);
            minimo = Math.min(numeros[i], minimo);
        }

        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}
