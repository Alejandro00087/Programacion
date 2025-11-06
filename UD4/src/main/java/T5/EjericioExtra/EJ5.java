package T5.EjericioExtra;
import  java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();

        String numeroStr = String.valueOf(numero);
        char primeraCifraChar = numeroStr.charAt(0);
        int primeraCifra = Character.getNumericValue(primeraCifraChar);

        System.out.println("Primera Cifra es: " + primeraCifra);


    }
}
