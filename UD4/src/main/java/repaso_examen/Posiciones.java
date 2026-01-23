package repaso_examen;
import java.util.*;

public class Posiciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        // 1. Solicitar frase hasta que no esté vacía
        do {
            System.out.print("Introduce una frase: ");
            frase = sc.nextLine();
        } while (frase.trim().isEmpty());

        // 2. Convertir la frase en un Vector de palabras
        String[] palabras = frase.split(" ");

        // 3. Mapa para guardar: Palabra -> Lista de sus posiciones
        // Ejemplo: "la" -> [1, 10]
        HashMap<String, ArrayList<Integer>> mapaPosiciones = new HashMap<>();

        // 4. Recorrer el vector de palabras
        for (int i = 0; i < palabras.length; i++) {
            String pal = palabras[i];
            int posicion = i + 1; // El ejercicio empieza a contar en 1, no en 0

            // SI LA PALABRA NO ESTÁ EN EL MAPA: Creamos su lista por primera vez
            if (!mapaPosiciones.containsKey(pal)) {
                mapaPosiciones.put(pal, new ArrayList<>());
            }

            // AÑADIMOS la posición a la lista de esa palabra
            mapaPosiciones.get(pal).add(posicion);
        }

        // 5. Imprimir el resultado con el formato obligatorio
        System.out.println("Posiciones de las palabras:");
        for (String pal : mapaPosiciones.keySet()) {
            System.out.println(pal + "=" + mapaPosiciones.get(pal));
        }
    }
}