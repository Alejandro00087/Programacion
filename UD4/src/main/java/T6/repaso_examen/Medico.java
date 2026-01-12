package repaso_examen;
import java.util.*; // Con el .* importas todo de golpe (Scanner, List, Map...)

public class Medico {
    public static void main(String[] args) {

        // 1. La LISTA para el orden (ArrayList)
        ArrayList<String> orden = new ArrayList<>();

        // 2. El MAPA para los datos (HashMap)
        HashMap<String, String> sintomas = new HashMap<>();

        // AÑADIMOS PACIENTE 1
        orden.add("Pepe"); // Va primero en la lista
        sintomas.put("Pepe", "Le duele la muela"); // Sus datos en el mapa

        // AÑADIMOS PACIENTE 2
        orden.add("Ana"); // Va segunda
        sintomas.put("Ana", "Tiene fiebre");

        // MOSTRAR EL ORDEN Y SU PROBLEMA
        System.out.println("--- CONSULTA MÉDICA ---");
        for (int i = 0; i < orden.size(); i++) {
            String nombre = orden.get(i); // Sacamos el nombre de la lista
            String problema = sintomas.get(nombre); // Buscamos su problema en el mapa

            System.out.println("Turno " + (i+1) + ": " + nombre + " -> " + problema);
        }
    }
}