package T6.b;
import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.print("Introduce una vocal: ");
        char vocal = sc.next().charAt(0);

        char vocalMayus = Character.toUpperCase(vocal);

        String resultado = frase.replace(vocal, vocalMayus);

        System.out.println(resultado);
    }
}
