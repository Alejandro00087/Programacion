package T5.IF;
import java.util.Scanner;

public class Ejercicio16 {
    public  static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la calificación");
        double calificacion = sc.nextDouble();

        if (calificacion >= 0 && calificacion < 3 ){
            System.out.println("Muy deficiente");
        }

        else if (calificacion >= 3 && calificacion < 5){
            System.out.println("Insuficiente");
        }

        else if (calificacion >= 5 && calificacion < 6){
            System.out.println("Bien");
        }

        else if (calificacion >= 6 && calificacion < 9){
            System.out.println("Notable");
        }

        else if (calificacion >= 9 && calificacion <= 10){
            System.out.println("Sobresaliente");
        }

    }
}
