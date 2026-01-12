package repaso_examen;

import java.util.ArrayList; // Pon el import aquí arriba para no escribir tanto luego

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<String> videojuegos = new ArrayList<>();

        videojuegos.add("Fortnite");
        videojuegos.add("Minecraft");
        videojuegos.add("GTAV");

        System.out.println("Tenemos estos videojuegos: " + videojuegos);

        // Borramos
        videojuegos.remove("GTAV");

        System.out.println("--- Lista tras borrar GTAV ---");

        // El bucle solo para mostrar los que quedan
        for (int i = 0; i < videojuegos.size(); i++) {
            System.out.println("Juego en posición " + i + ": " + videojuegos.get(i));
        }
    }
}