package T4.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        int base;
        int altura;
        int area;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la altura: ");
                altura = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base: ");
                base = sc2.nextInt();

        area = (base*altura)/2;

        System.out.println("El valor de la area es: "+area);


    }
}
