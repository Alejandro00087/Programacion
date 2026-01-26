package T7.ejercicios;
import java.util.*;

public class EJ5 {

    public static void main(String[] args) {
        List<String> empresas = Arrays.asList(
                "Uber", "Inditex", "Apple", "Ikea", "Oracle",
                "Iberdrola", "Endesa", "Amazon", "Adobe"
        );

        System.out.println("Empresas agrupadas por vocal inicial y ordenadas alfabéticamente:");

        Map<Character, List<String>> resultado = filtrarPorVocal(empresas);

        for (Map.Entry<Character, List<String>> entrada : resultado.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }

    public static Map<Character, List<String>> filtrarPorVocal(List<String> listaEmpresas) {
        Map<Character, List<String>> mapaVocales = new TreeMap<>();

        for (String empresa : listaEmpresas) {
            if (empresa != null && !empresa.isEmpty()) {
                char primeraLetra = Character.toLowerCase(empresa.charAt(0));

                if (esVocal(primeraLetra)) {
                    mapaVocales.putIfAbsent(primeraLetra, new ArrayList<>());

                    mapaVocales.get(primeraLetra).add(empresa);
                }
            }
        }

        for (List<String> lista : mapaVocales.values()) {
            Collections.sort(lista);
        }

        return mapaVocales;
    }

    private static boolean esVocal(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}