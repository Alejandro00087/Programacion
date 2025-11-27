package T6;
import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double[] array = new double[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        System.out.print("Introduce un valor real R: ");
        double R = sc.nextDouble();

        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= R) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " valores iguales o superiores a " + R);

    }
}
