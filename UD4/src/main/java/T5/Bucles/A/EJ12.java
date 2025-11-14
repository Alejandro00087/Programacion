package T5.Bucles.A;
import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor de A");
        int a = sc.nextInt();
        System.out.println("Introduce el valor de B");
        int b = sc.nextInt();

        int resultado = 1;
        for (int i = 1; i <= b; i++) {
            resultado = resultado * a;
        }

        System.out.println(a + " elevado a " + b + " es: " + resultado);
    }
}



