package ejercicios;
import java.util.Scanner;


public class Ejercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a invertir");
        double cantidadInvertida = sc.nextInt();

        System.out.println("Ingrese el interés porcentual anual");
        double InteresPorcentualAnual = sc.nextInt();

        System.out.println("Ingrese cuanto durara la inversion en meses");
        double InversionEnMeses = sc.nextInt();

        double DuracionEnAños = InversionEnMeses / 12;

        double CapitalFinal = cantidadInvertida * Math.pow((InteresPorcentualAnual / 100 + 1), DuracionEnAños);

        System.out.println("Capital final: " + CapitalFinal);
    }
}