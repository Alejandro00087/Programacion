package repaso_examen;

import java.util.Scanner;

public class EJ2_Cadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una cadena de texto");
        String cadena = sc.nextLine();

        System.out.println("Dime otra cadena de texto");
        String cadena2 = sc.nextLine();

        if (cadena.equalsIgnoreCase(cadena2)) {
            System.out.println("Son iguales");
        }

        else  {
            System.out.println("No son iguales");
        }
    }
}


