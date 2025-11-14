public class EJ5 {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 5; i++) {
            suma += Math.pow(i, 2);
        }

        System.out.println("La suma de los cuadrados es: " + suma);
    }
}
