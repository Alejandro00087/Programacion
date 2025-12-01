package T6.A;
import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Introduce el valor de N (tamaño del array): ");
        int N = sc.nextInt();

        System.out.print("Introduce el valor de M (valor a escribir): ");
        int M = sc.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = M;
        }

        System.out.println("Contenido del array:");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
