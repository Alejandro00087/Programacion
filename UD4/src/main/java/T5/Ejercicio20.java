package T5;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre:");
        String nombre = sc.nextLine();

        System.out.println("Introduce tus horas trabajadas:");
        int horasTrabajadas = sc.nextInt();

        System.out.println("Introduce tu tarifa por hora:");
        double tarifaPorHora = sc.nextDouble();

        double salarioBruto;
        if (horasTrabajadas <= 35) {
            salarioBruto = horasTrabajadas * tarifaPorHora;
        } else {
            int horasExtra = horasTrabajadas - 35;
            double pagoNormal = 35 * tarifaPorHora;
            double pagoHorasExtra = horasExtra * tarifaPorHora * 1.5;
            salarioBruto = pagoNormal + pagoHorasExtra;
        }

        double impuestos = 0.0;
        double restante = salarioBruto;

        if (restante > 500.0) {
            restante -= 500.0;
            double tramo25 = Math.min(restante, 400.0);
            impuestos += tramo25 * 0.25;
            restante -= tramo25;
            if (restante > 0) {
                impuestos += restante * 0.45;
            }
        }

        double salarioNeto = salarioBruto - impuestos;

        DecimalFormat df = new DecimalFormat("#0.00");
        String brutoStr = df.format(salarioBruto);
        String netoStr = df.format(salarioNeto);
        String impuestosStr = df.format(impuestos);

        System.out.println();
        System.out.println("Por las " + horasTrabajadas + " horas trabajadas, a " + nombre
                + " le corresponde un salario bruto de " + brutoStr
                + " y un neto de " + netoStr
                + " tras aplicar " + impuestosStr + " euros de impuestos.");

    }
}
