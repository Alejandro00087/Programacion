package T5.IF;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b){
            System.out.println(a + " , " + b);
        }

        else {

            System.out.println(b + " , " + a);
        }
    }
}
