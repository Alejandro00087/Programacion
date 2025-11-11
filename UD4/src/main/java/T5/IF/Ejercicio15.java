package T5.IF;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el importe total de tu pedido:");
        double importe = sc.nextDouble();

        double importeFinal = importe;

        if (importe > 100) {
            importeFinal = importe * 0.9; // 10% de descuento
            System.out.printf("Tu pedido de %.2f € tiene un descuento del 10%%, el precio final será %.2f €%n",
                    importe, importeFinal);
        } else if (importe < 50) {
            importeFinal = importe + 5.0; // recargo por envío
            System.out.printf("Tu pedido de %.2f € tiene un recargo por envío de 5 €, el precio final será %.2f €%n",
                    importe, importeFinal);
        } else {
            System.out.printf("Tu pedido de %.2f € no tiene ningún descuento ni recargo. Importe final: %.2f €%n",
                    importe, importeFinal);
        }
    }
}
