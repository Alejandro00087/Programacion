package T4.ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        double P_venta;
        double P_original;
        double descuento;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el valor original del producto: ");
        P_original = sc.nextDouble();

        System.out.print("Ingresa el precio de venta del producto: ");
        P_venta = sc.nextDouble();

        descuento = ((P_original - P_venta) / P_original) * 100;

        System.out.printf("El descuento es del %.2f%%%n", descuento);

    }
}

