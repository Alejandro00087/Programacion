package T4.ejercicios;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        int a;
        int suma;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        a = sc.nextInt();

        suma = (a*(a+1))/2;

        System.out.println("La suma de los primeros numeros enteros desde 1 hasta 5 es " + suma);


    }
}
