import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo mayor que 2: ");
        int n = sc.nextInt();

        boolean esPrimo = true;

        if (n <= 1) {
            esPrimo = false;
        }

        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(n + " es primo");
        } else {
            System.out.println(n + " NO es primo");
        }
    }
}
