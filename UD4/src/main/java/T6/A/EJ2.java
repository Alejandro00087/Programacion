package T6.A;
import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double[] NUMEROS = new double[10];
        double suma = 0;


        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el número real " + (i + 1) + ": ");
            NUMEROS[i] = sc.nextDouble();
            suma += NUMEROS[i];
        }

        System.out.println("La suma de los numeros es: " + suma);
    }
}