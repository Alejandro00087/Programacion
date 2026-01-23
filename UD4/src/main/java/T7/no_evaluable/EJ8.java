package T7.no_evaluable;
import java.util.Scanner;

public class EJ8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero N:");
        int n = sc.nextInt();

        int suma = suma1aN(n);
        int producto = producto1aN(n);
        double intermedio = intermedio1aN(n);

        System.out.println("La suma de 1 a " + n + " es: " + suma);
        System.out.println("El producto de 1 a " + n + " es: " + producto);
        System.out.println("El valor intermedio entre 1 y " + n + " es: " + intermedio);

        sc.close();
    }

    public static int suma1aN(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma = suma + i;
        }
        return suma;
    }

    public static int producto1aN(int n) {
        int producto = 1;
        for (int i = 1; i <= n; i++) {
            producto = producto * i;
        }
        return producto;
    }

    public static double intermedio1aN(int n) {
        return (1 + n) / 2.0;
    }
}