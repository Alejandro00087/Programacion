package T6.B;
import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.print("Introduce una vocal: ");
        char vocal = sc.next().charAt(0);

        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c == vocal || c == Character.toUpperCase(vocal)) {
                resultado += Character.toUpperCase(c);
            } else {
                resultado += c;
            }
        }

        System.out.println("\nResultado:");
        System.out.println(resultado);

        sc.close();
    }
}
