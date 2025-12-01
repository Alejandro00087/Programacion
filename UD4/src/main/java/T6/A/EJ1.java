package T6.A;
import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double[] NUMEROS = new double[10];


        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el número real " + (i + 1) + ": ");
            NUMEROS[i] = sc.nextDouble();
        }

        System.out.println("\nLos números reales ingresados son:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posición " + i + ": " + NUMEROS[i]);
        }
    }
}
