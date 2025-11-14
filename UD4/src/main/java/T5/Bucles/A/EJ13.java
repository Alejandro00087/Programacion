package T5.Bucles.A;
import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Piensa un número del 1 al 100 (escríbelo para probar): ");
        int numeroPensado = sc.nextInt();

        int limiteInferior = 1;
        int limiteSuperior = 100;
        int intento;
        char respuesta = ' ';

        while (respuesta != '=') {
            intento = (limiteInferior + limiteSuperior) / 2;

            System.out.println("¿Es " + intento + "? (responde con <, > o =)");

            respuesta = sc.next().charAt(0);

            if (respuesta == '>') {
                limiteInferior = intento + 1;
            } else if (respuesta == '<') {
                limiteSuperior = intento - 1;
            } else if (respuesta == '=') {
                System.out.println("Tu número es el " + intento);
            } else {
                System.out.println("Respuesta no válida. Usa solo <, > o =");
            }
        }

        sc.close();
    }
}
