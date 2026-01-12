package repaso_examen;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {

        double suma = 0;

        double numero[] = new double[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numero.length; i++) {
            numero[i] = sc.nextInt();
        }

        for (int i = 0; i < numero.length; i++) {
            suma += numero[i];
        }

        System.out.println("La suma es: " + suma);

    }
}
