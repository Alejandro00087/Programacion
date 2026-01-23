package T7.no_evaluable;
import java.util.Scanner;
public class EJ2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("introduce tu edad: ");
        int edadUsuario = sc.nextInt();


        boolean esMayor = esMayorEdad(edadUsuario);

        if (esMayor == true) {
            System.out.println("¡Eres mayor de edad");
        } else {
            System.out.println("eres menor de edad.");
        }

        sc.close();
    }

    public static boolean esMayorEdad(int a) {
        if (a >= 18) {
            return true;
        } else {
            return false;
        }
    }
}