package T4.EjercicioExtra;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Producto 1 (nombre): ");
        String nombre1 = sc.nextLine();
        System.out.println("Cantidad: ");
        int cantidad1 = Integer.parseInt(sc.nextLine());
        System.out.println("Precio unitario (€): ");
        double precioUnitario1 = Double.parseDouble(sc.nextLine());
        double subtotal1 = cantidad1 * precioUnitario1;

        System.out.println("Producto 2 (nombre): ");
        String nombre2 = sc.nextLine();
        System.out.println("Cantidad: ");
        int cantidad2 = Integer.parseInt(sc.nextLine());
        System.out.println("Precio unitario (€): ");
        double precioUnitario2 = Double.parseDouble(sc.nextLine());
        double subtotal2 = cantidad2 * precioUnitario2;

        System.out.println("Producto 3 (nombre): ");
        String nombre3 = sc.nextLine();
        System.out.println("Cantidad: ");
        int cantidad3 = Integer.parseInt(sc.nextLine());
        System.out.println("Precio unitario (€): ");
        double precioUnitario3 = Double.parseDouble(sc.nextLine());
        double subtotal3 = cantidad3 * precioUnitario3;

        System.out.println("Producto 4 (nombre): ");
        String nombre4 = sc.nextLine();
        System.out.println("Cantidad: ");
        int cantidad4 = Integer.parseInt(sc.nextLine());
        System.out.println("Precio unitario (€): ");
        double precioUnitario4 = Double.parseDouble(sc.nextLine());
        double subtotal4 = cantidad4 * precioUnitario4;

        System.out.println("Producto 5 (nombre): ");
        String nombre5 = sc.nextLine();
        System.out.println("Cantidad: ");
        int cantidad5 = Integer.parseInt(sc.nextLine());
        System.out.println("Precio unitario (€): ");
        double precioUnitario5 = Double.parseDouble(sc.nextLine());
        double subtotal5 = cantidad5 * precioUnitario5;

        int totalCantidad = cantidad1 + cantidad2 + cantidad3 + cantidad4 + cantidad5;
        double totalGeneral = subtotal1 + subtotal2 + subtotal3 + subtotal4 + subtotal5;

        System.out.println("-------------------------------------------------------------");
        System.out.printf("| %-12s | %8s | %12s | %12s |%n", "Producto", "Cantidad", "Precio Unit.", "Subtotales");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("| %-12s | %8d | %10.2f € | %10.2f € |%n", nombre1, cantidad1, precioUnitario1, subtotal1);
        System.out.printf("| %-12s | %8d | %10.2f € | %10.2f € |%n", nombre2, cantidad2, precioUnitario2, subtotal2);
        System.out.printf("| %-12s | %8d | %10.2f € | %10.2f € |%n", nombre3, cantidad3, precioUnitario3, subtotal3);
        System.out.printf("| %-12s | %8d | %10.2f € | %10.2f € |%n", nombre4, cantidad4, precioUnitario4, subtotal4);
        System.out.printf("| %-12s | %8d | %10.2f € | %10.2f € |%n", nombre5, cantidad5, precioUnitario5, subtotal5);
        System.out.println("-------------------------------------------------------------");
        System.out.printf("| %-12s | %8d | %12s | %10.2f € |%n", "TOTALES", totalCantidad, "", totalGeneral);
        System.out.println("-------------------------------------------------------------");

    }

}
