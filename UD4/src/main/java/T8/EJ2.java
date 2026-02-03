package T8;
import java.util.Scanner;

public class EJ2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = 0;
        int B = 0;

        try {
            System.out.print("Introduce un valor entero A: ");
            A = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(new Exception("Valor introducido incorrecto. Debe ser un entero.").getMessage());
            return;
        }

        try {
            System.out.print("Introduce un valor entero B: ");
            B = Integer.parseInt(scanner.nextLine());

            int resultado = dividir(A, B);
            System.out.println("El resultado de A/B es: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println(new Exception("Valor introducido incorrecto. Debe ser un entero.").getMessage());
        } catch (ArithmeticException e) {
            System.out.println(new Exception("No se puede dividir entre cero.").getMessage());
        }

        scanner.close();
    }

    public static int dividir(int A, int B) throws ArithmeticException {
        if (B == 0) {
            throw new ArithmeticException("División por cero.");
        }
        return A / B;
    }
}
