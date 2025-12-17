package T6.Estructuras_dinamicas.listas;

import java.util.ArrayList;

public class EJ1 {
    public static void main(String[] args) {

        ArrayList<String> compañeros = new ArrayList<>();

        compañeros.add("Ana");
        compañeros.add("Luis");
        compañeros.add("Carlos");
        compañeros.add("María");
        compañeros.add("Jorge");
        compañeros.add("Lucía");

        for (String nombre : compañeros) {
            System.out.println(nombre);
        }
    }
}
