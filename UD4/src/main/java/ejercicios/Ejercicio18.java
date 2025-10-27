package ejercicios;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de barras frescas vendidas");
        int barrasFrescas = sc.nextInt();

        System.out.println("Introduce el numero de barras que no son del día");
        int barrasMalas = sc.nextInt();

        double TotalBarrasFrescas = barrasFrescas * 1.2;
        double TotalBarrasMalas = barrasMalas * 0.6;
        double Total = TotalBarrasFrescas + TotalBarrasMalas;

        System.out.println("El total de ingresos del dia es " + Total + "€");
    }

}
