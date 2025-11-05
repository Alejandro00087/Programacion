package T4.ejercicios;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        int empanadillas;
        int napolitanas;
        double pesoGramos;
        double pesoKg;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de empanadilllas a enviar");
        empanadillas = sc.nextInt();
        System.out.println("Introduce el numero de napolitanas a enviar");
        napolitanas = sc.nextInt();

        pesoGramos = (empanadillas * 112) + (napolitanas * 75);
        pesoKg = pesoGramos / 1000;

        System.out.println("El peso total del paquete es " + pesoKg + "Kg");

    }
}
