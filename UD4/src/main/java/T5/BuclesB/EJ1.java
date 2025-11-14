package T5.BuclesB;
import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        int longitud = palabra.length();
        int repeticiones = longitud / 2;

        for (int i = 0; i < repeticiones; i++) {
            System.out.println(palabra);
        }
    }
}
