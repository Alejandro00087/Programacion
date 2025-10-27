package ejercicios;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        double radio;
        double longitud;
        double area;
        double volumen;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        radio = sc.nextInt();

        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Área del círculo: " + area);
        System.out.println("Volumen de la esfera: " + volumen);


    }
}