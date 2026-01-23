package T7.no_evaluable;

import java.util.*;

public class EJ11 {

    public static void mostrarTabla(int numero) {
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número para ver su tabla de multiplicar: ");
        int n = sc.nextInt();

        mostrarTabla(n);

        sc.close();
    }
}