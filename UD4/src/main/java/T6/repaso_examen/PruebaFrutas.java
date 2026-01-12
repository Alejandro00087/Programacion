package repaso_examen;
import java.util.ArrayList; // No olvides esto

public class PruebaFrutas {
    public static void main(String[] args) {

        // 1. CREAR la lista (El frutero vacío)
        ArrayList<String> frutas = new ArrayList<>();

        // 2. LLENAR (add)
        frutas.add("Manzana");  // Posición 0
        frutas.add("Pera");     // Posición 1
        frutas.add("Plátano");  // Posición 2

        System.out.println("Tengo " + frutas.size() + " frutas.");
        System.out.println("En la posición 1 está la: " + frutas.get(1)); // Dirá Pera

        // 3. BORRAR la Manzana (remove)
        System.out.println("--- Borro la Manzana (pos 0) ---");
        frutas.remove(0);

        // 4. COMPROBAR EL CAMBIO
        // Ahora Pera debería haberse movido a la 0
        System.out.println("Ahora en la posición 0 está la: " + frutas.get(0));
    }
}