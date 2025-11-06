package T5.EjericioExtra;
import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Qué hora es, ingresa solo la hora?");
        int hora = entrada.nextInt();

        if (hora >= 6 && hora <= 12) {

            System.out.println("Buenos dias");
        }

        else if (hora >= 13 && hora <= 20) {

            System.out.println("Buenas tardes");
        }

        if (hora < 0 || hora > 23) {
            System.out.println("Hora no válida. Introduce un valor entre 0 y 23.");
        }

        else{
            System.out.println("Buenas noches");
        }

    }
}
