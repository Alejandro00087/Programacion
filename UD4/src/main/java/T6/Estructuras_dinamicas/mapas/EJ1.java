package T6.Estructuras_dinamicas.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        HashMap<Character, Integer> mapa = new HashMap<>();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (mapa.containsKey(c)) {
                mapa.put(c, mapa.get(c) + 1);
            } else {
                mapa.put(c, 1);
            }
        }

        System.out.println("\nFrecuencia de caracteres:");
        for (Map.Entry<Character, Integer> entrada : mapa.entrySet()) {
            System.out.println("'" + entrada.getKey() + "' -> " + entrada.getValue());
        }

        sc.close();
    }
}
