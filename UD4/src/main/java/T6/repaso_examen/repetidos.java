package repaso_examen;
import java.util.*;

public class repetidos {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<>();

        nombres.add("Ana");
        nombres.add("Pepe");
        nombres.add("Luis");
        nombres.add("Ana");
        nombres.add("Luis");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println("En la lista hay realmente " + nombres.size() + " personas.");



    }
}
