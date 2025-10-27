package ejercicios;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        int a;
        int b;
        int suma;
        int resta;
        int producto;
        int division;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        a = sc.nextInt();
        System.out.println("Ingrese el valor de b: ");
        b = sc.nextInt();

        suma = a + b;
        resta = a - b;
        division = a / b;
        producto = a % b;

        System.out.println("El valor de suma es: " + suma);
        System.out.println("El valor de resta es: " + resta);
        System.out.println("El valor de division es: " + division);
        System.out.println("El valor de productos es: " + producto);






    }

}
