package repaso_examen;
import java.util.Scanner;

public class vectores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Declarar un vector de 5 posiciones
        int[] numeros = new int[5];

        // 2. Rellenarlo con un bucle
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el número para la posición " + i + ":");
            numeros[i] = sc.nextInt();
        }

        // 3. Calcular la suma y el mayor
        int suma = 0;
        int mayor = numeros[0]; // Empezamos asumiendo que el primero es el mayor

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("La suma total es: " + suma);
        System.out.println("El número más grande es: " + mayor);
    }
}