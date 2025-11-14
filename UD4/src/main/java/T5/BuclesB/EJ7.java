package T5.BuclesB;
import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas notas vas a introducir");
        int CantidadNotas = sc.nextInt();

        double suma = 0;

        for (int i = 1; i <= CantidadNotas; i++) {
            System.out.println("Dime número " + i + ":");
            int media = sc.nextInt();
            suma = suma + media;
        }

        double media = suma / CantidadNotas;

        System.out.println("La media de todas las notas es " + media);


    }
}
