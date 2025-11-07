package T5.EjericioExtra;
import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int a = sc.nextInt();

        if (a % 2 == 0 && a % 5 == 0) {
            System.out.println("El numero es par y divisible entre 5");
        }

        else {
            System.out.println("El numero no es par o divisible entre 5");
        }

    }
}
