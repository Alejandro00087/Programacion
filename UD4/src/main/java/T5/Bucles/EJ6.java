package T5.Bucles;
import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean hayNegativo = false;

        for (int i = 1; i <= 100; i++) {
            System.out.println("Ingrese un número (" + i + "/100): ");
            int num = sc.nextInt();

            if (num < 0) {
                hayNegativo = true;
            }
        }

        if (hayNegativo) {
            System.out.println("Se ha leído al menos un número negativo.");
        } else {
            System.out.println("No se ha leído ningún número negativo.");
        }

        sc.close();
    }
}
