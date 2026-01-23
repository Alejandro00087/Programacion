package T7.no_evaluable;
import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        int num1 = sc.nextInt();
        System.out.println("Dime un numero");
        int num2 = sc.nextInt();

        int resultado = minimo(num1, num2);

        System.out.println("El minimo es: " + resultado);

        sc.close();
    }
    public static int minimo(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}