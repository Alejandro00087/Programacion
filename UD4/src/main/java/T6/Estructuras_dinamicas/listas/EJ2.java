package T6.Estructuras_dinamicas.listas;

import java.util.ArrayList;
import java.util.Random;

public class EJ2 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Random r = new Random();

        int tamaño = r.nextInt(11) + 10;

        for (int i = 0; i < tamaño; i++) {
            numeros.add(r.nextInt(101));
        }

        int suma = 0;
        int max = numeros.get(0);
        int min = numeros.get(0);

        for (int num : numeros) {
            suma += num;

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        double media = (double) suma / numeros.size();

        System.out.println("Lista: " + numeros);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }
}
