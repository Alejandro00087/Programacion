package T5.Bucles.A;
import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

         int B500 = 500;
         int B200 = 200;
         int B100 = 100;
         int B50 = 50;
         int B20 = 20;
         int B10 = 10;
         int B5 = 5;

        System.out.print("Introduce una cantidad de billetes, tiene que ser múltiplo de 5: ");
        int cantidad = teclado.nextInt();

        if (cantidad % 5 != 0) {
            System.out.println("La cantidad no es multiplo de 5 ");
            return;
        }

        System.out.println("Billetes :");

        for (int x = 1; x <= 7; x++) {
            int valorBillete = 0;

            switch (x) {
                case 1:
                    valorBillete = B500;
                    break;
                case 2:
                    valorBillete = B200;
                    break;
                case 3:
                    valorBillete = B100;
                    break;
                case 4:
                    valorBillete = B50;
                    break;
                case 5:
                    valorBillete = B20;
                    break;
                case 6:
                    valorBillete = B10;
                    break;
                case 7:
                    valorBillete = B5;
                    break;
            }

            int cantidadBilletes = cantidad / valorBillete;

            if (cantidadBilletes > 0) {
                System.out.println(cantidadBilletes + " billete(s) de " + valorBillete + "€");
                cantidad = cantidad % valorBillete;
            }
        }
    }
}
