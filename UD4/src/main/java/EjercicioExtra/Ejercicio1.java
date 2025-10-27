package EjercicioExtra;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de segundos");
        int segundos = sc.nextInt();

        double dias = segundos / 60 / 60 / 24;
        double horas = ;
        double minutos = ;

        System.out.println("Equivale a: " + dias + " dia(s)," + horas + " hora(s)," + minutos + " minuto(s)");
    }
}
