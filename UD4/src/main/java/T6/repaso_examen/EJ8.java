package repaso_examen;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Crear el array de 100 números reales
        double[] numeros = new double[100];

        // 2. Rellenar con Math.random()
        for (int i = 0; i < numeros.length; i++) {
            // Math.random() ya da un valor entre 0.0 y 1.0 por defecto
            numeros[i] = Math.random();
        }

        // 3. Pedir el valor R al usuario
        System.out.print("Introduce un valor real entre 0.0 y 1.0 para comparar: ");
        double R = sc.nextDouble();

        // 4. Contar cuántos son mayores o iguales a R
        int contador = 0; // Esta variable cuenta las coincidencias
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= R) {
                contador++; // Si cumple la condición, sumamos 1 al contador
            }
        }

        // 5. Mostrar el resultado
        System.out.println("En el array hay " + contador + " valores iguales o superiores a " + R);
    }
}