import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        double radio, altura, volumen;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de la altura: ");
        altura = sc.nextDouble();

        System.out.print("Ingrese el valor del radio: ");
        radio = sc.nextDouble();

        volumen = (1 / 3) * Math.PI * Math.pow(radio, 2) * altura;

        System.out.println("El volumen del cono es: " + volumen);

    }
}

