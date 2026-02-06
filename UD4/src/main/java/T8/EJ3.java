package T8;
import java.util.Scanner;

public class EJ3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            try {
                System.out.print("Introduce un número (-999 para salir): ");
                int num = sc.nextInt();

                if (num == -999) {
                    salir = true;
                } else {
                    imprimePositivo(num);
                    imprimeNegativo(num);
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
    }

    static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            throw new Exception("El valor " + p + " no es positivo.");
        }
        System.out.println("Positivo: " + p);
    }

    static void imprimeNegativo(int n) throws Exception {
        if (n >= 0) {
            throw new Exception("El valor " + n + " no es negativo.");
        }
        System.out.println("Negativo: " + n);
    }
}