package T5.BuclesB;
import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce N1: ");
        int n1 = sc.nextInt();
        System.out.println("Introduce N2: ");
        int n2 = sc.nextInt();

        while (n1 >= n2) {
            System.out.println(n2 + " debe ser mayor que " + n1 + " vuelve a introducir N1: ");
            n1 = sc.nextInt();
            continue;
        }

    }
}
