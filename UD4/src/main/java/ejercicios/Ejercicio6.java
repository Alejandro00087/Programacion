package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        int lado;
        int area;

        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese lado: ");
        lado = reader.nextInt();

        area = lado * lado;

        System.out.println("El area del cuadrado es " + area);



    }
}
