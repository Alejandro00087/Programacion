package T7.no_evaluable;
import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce el precio número " + i + ": ");
            double precio = sc.nextDouble();

            double resultado = precioConIVA(precio);

            System.out.println("El precio de venta es: " + resultado);
            System.out.println();
        }

        sc.close();
    }

    public static double precioConIVA(double precio) {
        double precioFinal = precio * 1.21;
        return precioFinal;
    }
}