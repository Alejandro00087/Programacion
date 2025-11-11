package T5.IF;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Como te llamas?");
        String nombre = sc.nextLine();

        System.out.println("Cual es tu genero (H o M)?");
        char genero = sc.next().charAt(0);

        char inicial = Character.toUpperCase(nombre.charAt(0));

        String grupo;

        if ((genero == 'M' && inicial <= 'M') || (genero == 'H' && inicial >= 'N')) {
            grupo = "A";
        }

        else {
            grupo = "B";
        }

        System.out.println("Tu grupo es " + grupo);
    }
}

