package T7.no_evaluable;

import java.util.*;

public class EJ9 {
    public static int maximo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tres numeros enteros:");

        System.out.print("Valor 1: ");
        int n1 = sc.nextInt();

        System.out.print("Valor 2: ");
        int n2 = sc.nextInt();

        System.out.print("Valor 3: ");
        int n3 = sc.nextInt();

        int ganadorRonda1 = maximo(n1, n2);

        int ganadorFinal = maximo(ganadorRonda1, n3);

        System.out.println("El numero más grande es el: " + ganadorFinal);

        sc.close();
    }
}