import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int ultimoNumero;
        int total = 0;
        int validos = 0;
        int fallos = 0;

        System.out.print("Número 1: ");
        ultimoNumero = input.nextInt();
        total++;
        validos++;

        int contador = 2;

        do {
            System.out.print("Número " + contador + ": ");
            numero = input.nextInt();

            if (numero == 0) {
                break;
            }

            total++;

            if (numero > ultimoNumero) {
                validos++;
                ultimoNumero = numero;
            } else {
                fallos++;
                System.out.println("Fallo! Errores = " + fallos);
            }

            contador++;

        } while (numero != 0);

        System.out.println("--------------------------------");
        System.out.println("Total de números introducidos: " + total);
        System.out.println("Total de números válidos: " + validos);
        System.out.println("Total de fallos: " + fallos);
    }
}
