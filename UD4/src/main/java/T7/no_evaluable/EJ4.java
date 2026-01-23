package T7.no_evaluable;
import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        int a = sc.nextInt();

        int resultado = dimeSigno(a);

        if (resultado == 1) {
            System.out.println("El número es POSITIVO");
        } else if (resultado == -1) {
            System.out.println("El número es NEGATIVO");
        } else {
            System.out.println("El número es CERO");
        }

        sc.close();
    }

    public static int dimeSigno(int a){
        if (a < 0){
            return -1;
        }
        else if (a > 0){
            return 1;
        }
        else {
            return 0;
        }
    }
}