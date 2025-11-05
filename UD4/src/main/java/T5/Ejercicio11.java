package T5;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una temperatura:");
        float temperatura = sc.nextFloat();

        System.out.println("Elige la opción de conversión:");
        System.out.println("1 - De Celsius a Fahrenheit");
        System.out.println("2 - De Fahrenheit a Celsius");
        System.out.println("3 - De Celsius a Kelvin");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(temperatura + " grados Celsius son " + ((temperatura * 9 / 5) + 32) + " Fahrenheit");
                break;

            case 2:
                System.out.println(temperatura + " grados Fahrenheit son " + ((temperatura - 32) * 5 / 9) + " Celsius");
                break;

            case 3:
                System.out.println(temperatura + " grados Celsius son " + (temperatura + 273.15) + " Kelvin");
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }

        sc.close();
    }
}

