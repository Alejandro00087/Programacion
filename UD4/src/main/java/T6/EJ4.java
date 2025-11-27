package T6;
import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int[] NUMEROS = new int[20];
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingresa el número entero " + (i + 1) + ": ");
            NUMEROS[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            if (NUMEROS[i] > 0) {
                sumaPositivos += NUMEROS[i];
            } else if (NUMEROS[i] < 0) {
                sumaNegativos += NUMEROS[i];
            }
        }

        System.out.println("Suma de los valores positivos: " + sumaPositivos);
        System.out.println("Suma de los valores negativos: " + sumaNegativos);

    }
}
