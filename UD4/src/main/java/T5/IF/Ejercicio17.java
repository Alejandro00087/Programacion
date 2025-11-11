package T5.IF;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la hora (HH:MM:SS): ");
        String hora = sc.nextLine();

        String[] partes = hora.split(":");
        int h = Integer.parseInt(partes[0]);
        int m = Integer.parseInt(partes[1]);
        int s = Integer.parseInt(partes[2]);

        s++;

        if (s == 60) {
            s = 0;
            m++;
        }
        if (m == 60) {
            m = 0;
            h++;
        }
        if (h == 24) {
            h = 0;
        }
        System.out.printf("Salida: %02d:%02d:%02d%n", h, m, s);
    }
}

