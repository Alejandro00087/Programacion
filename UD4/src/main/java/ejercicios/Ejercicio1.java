package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static  void main(String args[]) {
        int diasdelano = 365;
        int horasdia = 24;
        int minuto = 60;
        int segundo = 60;

        int horasano = diasdelano * horasdia;
        int minutosano = horasano * minuto;
        int segundosano = horasano * segundo;

        System.out.println("Horas en un año: " + horasano);
        System.out.println("Minutos en un año: " + minutosano);
        System.out.println("Segundos en un año: " + segundosano);

    }
}
