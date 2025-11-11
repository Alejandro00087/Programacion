package T5.Bucles;
import java.util.Scanner;

public class EJ7 {
    public  static void main(String[] args) {

        int positivo = 0;
        int negativo = 0;

        Scanner sc = new Scanner(System.in);



        for (int i = 1; i <= 10; i++){
            System.out.println("Ingrese 10 numeros");
            int a = sc.nextInt();

            if (a > 0){
                positivo++;
            }

            else{
                negativo++;
            }

        }
        System.out.println("Hay " + positivo + " numeros positivos " + negativo + " numeros negativos ");
    }
}
