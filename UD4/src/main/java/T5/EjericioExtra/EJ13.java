package T5.EjericioExtra;
import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();

        String texto = String.valueOf(numero);

        if (texto.charAt(0) == texto.charAt(texto.length() - 1)) {

            if (texto.charAt(1) == texto.charAt(texto.length() - 2)) {

                if (texto.charAt(2) == texto.charAt(texto.length() - 3)) {

                    System.out.println("El numero es capicua");
                }
            }
        }

        else {
            System.out.println("El numero no es capicua");
            }






    }
}
