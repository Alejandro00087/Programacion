package T5;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();

        if(edad>0 && edad<=4){
            System.out.println("El precio de la entrada es gratuito");
        }

        else if (edad>4 && edad<=17){
            System.out.println("El precio de la entrada es de 5€");
        }

        else{
            System.out.println("El precio de la entrada es de 10€");
        }

    }
}
