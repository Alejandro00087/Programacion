package T5;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un año");
        int anyo = sc.nextInt();

        if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0) {
            System.out.println("El año es bisiesto");
        }

        else {
            System.out.println("El año no es bisiesto");
        }

    }
}
