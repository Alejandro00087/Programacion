package T5.BuclesB;
import java. util.Scanner;

public class EJ6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();

        int multiplo = 0;

        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0){
                multiplo ++;
            }
        }

        System.out.println("Cantidad de multiplos de 3: " + multiplo);


        }

}

