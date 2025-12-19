package T6.Estructuras_dinamicas.mapas;

import java.util.HashMap;
import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frase = "";

        while (frase.trim().isEmpty()) {
            frase = sc.nextLine();
        }

        String[] palabras = frase.split("\\s+");

        HashMap<String, String> mapa = new HashMap<>();

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            int posicion = i + 1;

            if (mapa.containsKey(palabra)) {
                mapa.put(palabra, mapa.get(palabra) + ", " + posicion);
            } else {
                mapa.put(palabra, String.valueOf(posicion));
            }
        }

        System.out.println("Posiciones de las palabras:");
        for (String palabra : mapa.keySet()) {
            System.out.println(palabra + "=[" + mapa.get(palabra) + "]");
        }

        sc.close();
    }
}