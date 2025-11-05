package T4.ejercicios;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        double millas;
        double metros;

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la millas: ");
        millas = leer.nextDouble();

        metros = millas * 1852;

        System.out.println(millas + " millas son " + metros + " metros");





    }
}
