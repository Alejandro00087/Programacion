package T5.IF;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¡Bienvenido a la pizzería BELLA NAPOLI!");
        System.out.println("Tipos de pizza:");
        System.out.printf("\t1 - Vegetariana\n\t2 - No vegetariana\n");
        System.out.print("Introduce el número correspondiente al tipo de pizza que quieres: ");
        int opcion = sc.nextInt();

        String tipoPizza = "";
        String ingrediente = "";

        if (opcion == 1) {
            tipoPizza = "vegetariana";
            System.out.println("Ingredientes de pizzas vegetarianas:");
            System.out.println("\t1 - Pimiento");
            System.out.println("\t2 - Tofu");
            System.out.print("Introduce el ingrediente que deseas: ");
            int opcion2 = sc.nextInt();

            switch (opcion2) {
                case 1 -> ingrediente = "pimiento";
                case 2 -> ingrediente = "tofu";
                default -> System.out.println("Opción no válida.");
            }

        }

        else if (opcion == 2) {
            tipoPizza = "no vegetariana";
            System.out.println("Ingredientes de pizzas no vegetarianas:");
            System.out.println("\t1 - Pepperoni");
            System.out.println("\t2 - Jamón");
            System.out.println("\t3 - Salmón");
            System.out.print("Introduce el ingrediente que deseas: ");
            int opcion2 = sc.nextInt();

            switch (opcion2) {
                case 1 -> ingrediente = "pepperoni";
                case 2 -> ingrediente = "jamón";
                case 3 -> ingrediente = "salmón";
                default -> System.out.println("Opción no válida.");
            }
        }

        else {
            System.out.println("Opción no válida. Intenta de nuevo.");
        }

        if (!ingrediente.equals("")) {
            System.out.println("Has elegido la pizza " + tipoPizza +
                    " con tomate, mozzarella y " + ingrediente + ".");
        }
    }
}
