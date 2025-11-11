package T5.Bucles;
import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        boolean hayDiez = false;

        do {
            System.out.println("Ingresa una nota (0 a 10, o -1 para terminar):");
            a = sc.nextInt();

            if (a == 10) {
                hayDiez = true;
            }

        } while (a != -1);

        if (hayDiez) {
            System.out.println("Hay al menos una nota con 10.");
        } else {
            System.out.println("No hay ninguna nota con 10.");
        }

        sc.close();
    }
}
