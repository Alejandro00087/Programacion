package T7.no_evaluable;
import java.util.Scanner;


public class EJ13 {
    public static double calcularDescuento(double precioOriginal, double precioConDescuento) {
        return ((precioOriginal - precioConDescuento) / precioOriginal) * 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el precio del producto antes de aplicar el descuento:");
        double precioOriginal = scanner.nextDouble();

        System.out.println("Introduce el precio del producto después de aplicar el descuento:");
        double precioConDescuento = scanner.nextDouble();

        double descuento = calcularDescuento(precioOriginal, precioConDescuento);
        System.out.printf("El porcentaje de descuento es: %.2f%%\n", descuento);

        scanner.close();
    }
}