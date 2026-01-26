package T7.no_evaluable;
public class EJ15 {

    public static void main(String[] args) {
        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        int sumaTotal = calcularSuma(numeros);
        double media = calcularMedia(numeros);
        System.out.println("La suma de los primeros 100 números es: " + sumaTotal);
        System.out.println("La media de los valores es: " + media);
    }
    public static int calcularSuma(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
    }
    public static double calcularMedia(int[] array) {
        if (array.length == 0) {
            return 0.0;
        }

        int suma = calcularSuma(array);

        return (double) suma / array.length;
    }
}