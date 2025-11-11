package T5.IF;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int numero = sc.nextInt();

        if (numero >= 0 ) {
            System.out.println("El numero es positivo");
        }

        else {
            System.out.println("El numero es negativo");
        }

    }
}
