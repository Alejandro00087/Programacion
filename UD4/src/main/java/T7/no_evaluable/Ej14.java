package T7.no_evaluable;
public class Ej14 {

    public static void main(String[] args) {
        imprimirTriangulo('a', 4);

    }

    public static void imprimirTriangulo(char caracter, int numLineas) {
        for (int i = 1; i <= numLineas; i++) {

            for (int j = 0; j < numLineas - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (i * 2) - 1; k++) {
                System.out.print(caracter);
            }

            System.out.println();
        }
    }
}