package repaso_examen;

import java.util.ArrayList; // 1. OBLIGATORIO: Importar esto
import java.util.Scanner;

public class AgendaSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2. CREAR LA LISTA (Fíjate: no ponemos tamaño, es infinita)
        ArrayList<String> agenda = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n--- MI AGENDA ---");
            System.out.println("1. Añadir nombre");
            System.out.println("2. Ver todos");
            System.out.println("3. Salir");
            System.out.print("Elige: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el intro (siempre después de leer número)

            if (opcion == 1) {
                System.out.print("Dime el nombre: ");
                String nombre = sc.nextLine();

                // METER EN LA LISTA (.add)
                agenda.add(nombre);
                System.out.println("¡Guardado!");

            } else if (opcion == 2) {
                System.out.println("--- LISTA DE CONTACTOS ---");

                // RECORRER LA LISTA (Fíjate en .size() y .get(i))
                for (int i = 0; i < agenda.size(); i++) {
                    System.out.println(i + ". " + agenda.get(i));
                }
            }

        } while (opcion != 3);
    }
}