package T6;

import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(1 + Math.random() * 10);
        }

        System.out.print("Introduce un valor N (1-10): ");
        int N = sc.nextInt();
        System.out.println("El valor " + N + " aparece en las posiciones:");
        boolean encontrado = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == N) {
                System.out.print(i + " ");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println(" → No aparece en el array.");
        }

        sc.close();
    }
}
