package T5.BuclesB;
import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce N1: ");
        int n1 = sc.nextInt();

        System.out.println("Introduce N2: ");
        int n2 = sc.nextInt();

        int pares = 0;

        while (n1 >= n2) {
            System.out.println("N2 debe ser mayor que N1. Vuelve a introducir N2: ");
            n2 = sc.nextInt();
        }

        for (int i = n1; i <= n2; i++) {
            System.out.println(i);

            if (i % 2 == 0) {
                pares++;
            }
        }

        System.out.println("La cantidad de números pares es: " + pares);
    }
}
