import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas alturas quieres introducir? ");
        int N = sc.nextInt();

        double[] alturas = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Introduce la altura de la persona " + (i+1) + " (en metros): ");
            alturas[i] = sc.nextDouble();
        }

        double suma = 0;
        double min = alturas[0];
        double max = alturas[0];

        for (int i = 0; i < N; i++) {
            suma += alturas[i];
            if (alturas[i] < min) min = alturas[i];
            if (alturas[i] > max) max = alturas[i];
        }

        double media = suma / N;

        int porEncima = 0;
        int porDebajo = 0;

        for (double altura : alturas) {
            if (altura > media) porEncima++;
            else if (altura < media) porDebajo++;
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Altura media: " + media);
        System.out.println("Altura mínima: " + min);
        System.out.println("Altura máxima: " + max);
        System.out.println("Personas por encima de la media: " + porEncima);
        System.out.println("Personas por debajo de la media: " + porDebajo);

        sc.close();
    }
}
