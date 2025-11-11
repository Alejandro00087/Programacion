package T5.Bucles;
import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int positivo = 0;
        int negativo = 0;
        int a = 1;

        while (a != 0) {
            System.out.println("Ingresa un número (0 para terminar):");
            a = sc.nextInt();

            if (a > 0) {
                positivo++;
            } else if (a < 0) {
                negativo++;
            }
        }

        System.out.println("Se han leído " + positivo + " números positivos y " + negativo + " números negativos.");

        sc.close();
    }
}
