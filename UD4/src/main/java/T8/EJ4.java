package T8;
import java.util.*;

public class EJ4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 0;
        boolean nValido = false;

        while (!nValido) {
            try {
                System.out.print("Introduce el tamaño del vector (N): ");
                n = sc.nextInt();

                if (n <= 0) {
                    throw new Exception("El tamaño debe ser mayor que 0.");
                }
                nValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero.");
                sc.next();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}