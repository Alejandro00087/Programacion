package T4.ejercicios;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        int horasTrabajadas;
        int tarifaHoras;
        double bruto;
        double neto;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de horas trabajadas");
        horasTrabajadas = sc.nextInt();

        System.out.println("Ingresa la tarifa por hora");
        tarifaHoras = sc.nextInt();

        bruto = horasTrabajadas * tarifaHoras;
        neto = bruto - (bruto * 0.15);

        System.out.println("Tu paga en bruto es de " + bruto + " y en neto es " + neto + " (retención del 15%)");



    }
}
