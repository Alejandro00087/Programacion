package T6.Estructuras_dinamicas.conjuntos;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una frase");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");

        Set<String> todas = new TreeSet<>();
        Set<String> repetidas = new TreeSet<>();
        Set<String> noRepetidas = new TreeSet<>();

        for (String palabra : palabras) {
            palabra = palabra.toLowerCase();

            if (!todas.add(palabra)) {
                repetidas.add(palabra);
            }
        }

        for (String palabra : todas) {
            if (!repetidas.contains(palabra)) {
                noRepetidas.add(palabra);
            }
        }

        System.out.println("Palabras repetidas: " + repetidas);
        System.out.println("Palabras no repetidas: " + noRepetidas);
    }
}
