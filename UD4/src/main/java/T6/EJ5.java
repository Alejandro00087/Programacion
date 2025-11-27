package T6;
import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double[] NUMEROS = new double[20];
        double suma = 0;
        double media;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el valor del número " + (i + 1) + ": ");
            NUMEROS[i] = sc.nextDouble();
            suma += NUMEROS[i];
        }

        media = suma / 20;

        System.out.println("La media de los números es: " + media);

    }
}
