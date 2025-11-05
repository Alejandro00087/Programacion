import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce N1: ");
        double n1 = sc.nextDouble();

        System.out.print("Introduce N2: ");
        double n2 = sc.nextDouble();

        if (n1 == n2) {
            System.out.println("Los números son iguales. El programa finalizará.");
        }
        else {
            boolean esEnteroN1 = n1 % 1 == 0;
            boolean esEnteroN2 = n2 % 1 == 0;

            if (esEnteroN1 && esEnteroN2) {
                System.out.println("Números enteros: " + (int) n1 + " y " + (int) n2);
            }
            else if (esEnteroN1) {
                System.out.println("Números enteros: " + (int) n1);
            }
            else if (esEnteroN2) {
                System.out.println("Números enteros: " + (int) n2);
            }
            else {
                System.out.println("Ningún número es entero");
            }
        }

    }
}

