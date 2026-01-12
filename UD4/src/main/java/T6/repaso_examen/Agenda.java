package repaso_examen;

import java.util.Scanner;
import java.util.ArrayList;

public class Agenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Lista para guardar los contactos como frases completas
        ArrayList<String> agenda = new ArrayList<>();
        int opcion;

        do {
            // Mostramos el menú tal cual sale en tu foto
            System.out.println("\nAgenda de Contactos:");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Ver contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // Limpieza necesaria después de nextInt()

            if (opcion == 1) {
                // OPCIÓN AÑADIR
                System.out.print("Introduce el nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Introduce el teléfono: ");
                String telf = sc.nextLine();

                // Guardamos con el formato de la imagen
                agenda.add("Nombre: " + nombre + ", Teléfono: " + telf);
                System.out.println("Contacto añadido.");

            } else if (opcion == 2) {
                // OPCIÓN VER (Con for normal)
                System.out.println("\nContactos:");
                for (int i = 0; i < agenda.size(); i++) {
                    System.out.println(agenda.get(i));
                }

            } else if (opcion == 3) {
                // OPCIÓN BUSCAR
                System.out.print("Introduce el nombre a buscar: ");
                String buscar = sc.nextLine();

                for (int i = 0; i < agenda.size(); i++) {
                    String contacto = agenda.get(i);
                    // Comprobamos si el texto contiene el nombre (ignorando mayúsculas)
                    if (contacto.toLowerCase().contains(buscar.toLowerCase())) {
                        System.out.println(contacto);
                    }
                }

            } else if (opcion == 4) {
                // OPCIÓN ELIMINAR
                System.out.print("Introduce el nombre del contacto a eliminar: ");
                String eliminar = sc.nextLine();

                for (int i = 0; i < agenda.size(); i++) {
                    if (agenda.get(i).toLowerCase().contains(eliminar.toLowerCase())) {
                        agenda.remove(i);
                        System.out.println("Contacto eliminado.");
                        break; // Importante: salimos del bucle tras borrar
                    }
                }
            }

        } while (opcion != 5);

        System.out.println("Saliendo del programa...");
    }
}