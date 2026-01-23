package T7.ejercicios;
import java.util.Scanner;

public class EJ2 {

    public static int[] contarPorLongitud(String[] palabras, int valor) {
        int[] resultado = {0, 0, 0};

        for (String palabra : palabras) {
            int length = palabra.length();
            if (length == valor) {
                resultado[0]++;
            } else if (length < valor) {
                resultado[1]++;
            } else {
                resultado[2]++;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las palabras separadas por espacios:");
        String input = scanner.nextLine();
        String[] palabrasArray = input.split(" ");

        System.out.println("Introduce la longitud de referencia:");
        int valor = scanner.nextInt();

        int[] resultados = contarPorLongitud(palabrasArray, valor);

        System.out.println("Palabras de longitud igual: " + resultados[0]);
        System.out.println("Palabras de longitud menor" + resultados[1]);
        System.out.println("Palabras de longitud mayor" + resultados[2]);

        scanner.close();
    }
}