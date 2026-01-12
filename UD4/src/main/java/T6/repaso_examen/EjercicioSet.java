package repaso_examen;

import java.util.HashSet; // IMPORTANTE: Importar el Set

public class EjercicioSet {
    public static void main(String[] args) {

        // 1. CREAR EL CONJUNTO
        HashSet<String> invitados = new HashSet<>();

        // 2. AÑADIR DATOS (Fíjate que repito "Pepe" y "Ana")
        invitados.add("Pepe");
        invitados.add("Ana");
        invitados.add("Luis");
        invitados.add("Pepe"); // Este es repetido, Java lo ignorará
        invitados.add("Ana");  // Este también lo ignorará

        // 3. COMPROBAR EL TAMAÑO
        // Aunque hemos hecho 5 "adds", el tamaño será 3
        System.out.println("¿Cuántas personas únicas hay? " + invitados.size());

        // 4. BUSCAR SI ALGUIEN ESTÁ (Método .contains)
        if (invitados.contains("Luis")) {
            System.out.println("Luis está en la lista.");
        }

        // 5. MOSTRAR TODO (Verás que el orden es aleatorio)
        System.out.println("Lista de invitados (sin repetidos):");
        for (String nombre : invitados) {
            System.out.println("- " + nombre);
        }
    }
}