package T5.EjericiosExtraIF;
import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int numero = sc.nextInt();

        System.out.println("La ultima cifra es: " + numero % 10);

    }
}
