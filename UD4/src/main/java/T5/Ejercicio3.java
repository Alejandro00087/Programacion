package T5;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int a = sc.nextInt();

        System.out.println("Dime otro numero");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("El numero " + a + " es mayor a " + b);
        }

        else if (a < b) {
            System.out.println("El numero " + a + " es menor a " + b);
        }

        else {
            System.out.println("El numero " + a + " es igual a " + b);
        }
    }
}
