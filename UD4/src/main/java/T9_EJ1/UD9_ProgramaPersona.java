package T9_EJ1;
import java.util.Scanner;

public class UD9_ProgramaPersona {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        System.out.println("Introduce los datos de la primera persona:");
        System.out.print("DNI: ");
        persona1.dni = sc.nextLine();

        System.out.print("Nombre: ");
        persona1.nombre = sc.nextLine();

        System.out.print("Apellidos: ");
        persona1.apellidos = sc.nextLine();

        System.out.print("Edad: ");
        persona1.edad = sc.nextInt();
        sc.nextLine();

        System.out.println("\nIntroduce los datos de la segunda persona:");
        System.out.print("DNI: ");
        persona2.dni = sc.nextLine();

        System.out.print("Nombre: ");
        persona2.nombre = sc.nextLine();

        System.out.print("Apellidos: ");
        persona2.apellidos = sc.nextLine();

        System.out.print("Edad: ");
        persona2.edad = sc.nextInt();

        System.out.println();
        mostrarMayorEdad(persona1);
        mostrarMayorEdad(persona2);

        sc.close();
    }

    public static void mostrarMayorEdad(Persona p) {
        String mensaje = p.nombre + " " + p.apellidos +
                " con DNI " + p.dni +
                (p.edad >= 18 ? " es mayor de edad." : " no es mayor de edad.");

        System.out.println(mensaje);
    }
}
