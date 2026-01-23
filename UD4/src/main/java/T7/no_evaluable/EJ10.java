package T7.no_evaluable;

import java.util.*;

public class EJ10 {

    public static boolean validarFecha(int dia, int mes, int anio) {
        if ((dia >= 1 && dia <= 30) && (mes >= 1 && mes <= 12) && (anio > 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int d = sc.nextInt();

        System.out.print("Introduce el mes: ");
        int m = sc.nextInt();

        System.out.print("Introduce el año: ");
        int a = sc.nextInt();

        if (validarFecha(d, m, a)) {
            System.out.println("La fecha es CORRECTA.");
        } else {
            System.out.println("La fecha es INCORRECTA.");
        }

        sc.close();
    }
}