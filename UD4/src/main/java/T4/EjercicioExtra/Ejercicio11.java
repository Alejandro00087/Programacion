package T4.EjercicioExtra;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        String numeroTexto = sc.nextLine(); // leer como cadena

        int numero = Integer.parseInt(numeroTexto); // convertir a entero
        int resultado = numero + 10; // sumar 10

        System.out.println("El resultado es: " + resultado);

    }

}

