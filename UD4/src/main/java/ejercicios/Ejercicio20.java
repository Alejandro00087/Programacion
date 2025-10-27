package ejercicios;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la inversion inicial");
        double inicial = sc.nextDouble();

        double año1 = inicial * (1 + 0.04);
        double año2 = año1 * (1 + 0.04);
        double año3 = año2 * (1 + 0.04);

        System.out.printf("Balance año 1: %.2f\n", año1);
        System.out.printf("Balance año 1: %.2f\n", año2);
        System.out.printf("Balance año 1: %.2f\n", año3);

    }
}
