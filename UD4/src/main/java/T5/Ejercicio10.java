package T5;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();

        System.out.println("Introduce tus ingresos");
        int ingreso = sc.nextInt();

        if (edad >= 16 && ingreso >= 1000) {
            System.out.println("Tienes que triburar");
        }

        else {
            System.out.println("No tienes que tributar");
        }
    }
}
