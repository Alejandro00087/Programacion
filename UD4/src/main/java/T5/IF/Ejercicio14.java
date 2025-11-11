package T5.IF;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu renta anual");
        double renta = sc.nextInt();

        if (renta > 0 && renta <= 10000){
            System.out.println("Tipo impositivo 5%");
        }

        else if (renta > 10000 && renta <= 20000){
            System.out.println("Tipo impositivo 15%");
        }

        else if (renta > 20000 && renta <= 35000) {
            System.out.println("Tipo impositivo 20%");
        }

        else if (renta > 35000 && renta <= 60000){
            System.out.println("Tipo impositivo 30%");
        }

        else if (renta >= 60000){
            System.out.println("Tipo impositivo 45%");
        }

        else{
            System.out.println("valor no valido");
        }

    }
}
