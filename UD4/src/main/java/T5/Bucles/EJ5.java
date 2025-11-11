package T5.Bucles;
import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + n + " es igual a " + factorial);





    }
}
