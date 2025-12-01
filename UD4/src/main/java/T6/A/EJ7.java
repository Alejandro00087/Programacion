package T6.A;
import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor entero P: ");
        int P = sc.nextInt();

        System.out.print("Introduce el valor entero Q: ");
        int Q = sc.nextInt();

        int tamaño = (Q - P) + 1;
        int[] array = new int[tamaño];

        int valor = P;
        for (int i = 0; i < tamaño; i++) {
            array[i] = valor;
            valor++;
        }

        System.out.println("Contenido del array:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
