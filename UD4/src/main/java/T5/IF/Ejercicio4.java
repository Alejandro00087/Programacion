package T5.IF;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tres numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("El numero " + a + " es el mayor");
        }

        else if (a < b && b > c){
            System.out.println("El numero " + b + " es el mayor");
        }

        else if (a < c && c > b){
            System.out.println("El numero " + c + " es el mayor");
        }

        else {
            System.out.println("Los numeros son iguales");
        }

    }
}
