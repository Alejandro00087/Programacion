import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double[] NUMEROS = new double[10];


        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el número real " + (i + 1) + ": ");
            NUMEROS[i] = sc.nextDouble();
        }

        double max = NUMEROS[0];
        double min = NUMEROS[0];

        for (int i = 0; i < 10; i++) {
            if (NUMEROS[i] > max) max = NUMEROS[i];
            if (NUMEROS[i] < min) min = NUMEROS[i];
        }

        System.out.println("El numero máximo es: " + max);
        System.out.println("El numero mínimo es: " + min);

    }
}
