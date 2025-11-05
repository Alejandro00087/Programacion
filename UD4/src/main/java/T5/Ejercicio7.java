import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número con decimales: ");
        double numero = sc.nextDouble();

        int parteEntera = (int) numero;

        if (parteEntera % 2 == 0) {
            System.out.println("El número " + parteEntera + " es par");
        } else {
            System.out.println("El número " + parteEntera + " es impar");
        }

    }
}

