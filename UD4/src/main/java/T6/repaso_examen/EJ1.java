package repaso_examen;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {

        double[] numeros = new double[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un numero");
            numeros[i] = sc.nextDouble();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
