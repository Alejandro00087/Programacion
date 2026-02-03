package T8;
import java.util.Scanner;
import java.util.InputMismatchException;

public class EJ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        boolean entradaValida = false;

        while (intentos < 3 && !entradaValida) {
            try {
                System.out.print("Por favor, introduce un valor entero A: ");
                int a = scanner.nextInt();
                System.out.println("Valor introducido: " + a);
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Valor introducido incorrecto");
                scanner.nextLine();
                intentos++;
            }
        }

        if (!entradaValida) {
            System.out.println("Has agotado el número máximo de intentos.");
        }

        scanner.close();
    }
}