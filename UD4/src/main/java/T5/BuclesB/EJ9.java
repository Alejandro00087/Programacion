package T5.BuclesB;
import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo mayor que 2: ");
        int numero = sc.nextInt();

        boolean esPrimo = true;

        if (numero <= 2) {
            System.out.println("El número debe ser mayor que 2.");
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(numero + " es primo");
            } else {
                System.out.println(numero + " no es primo");
            }
        }

        sc.close();
    }
}
