package ejercicios;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        int dividendo;
        int divisor;
        int cociente;
        int resto;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dividendo :");
        dividendo = leer.nextInt();
        System.out.println("Ingrese el divisor :");
        divisor = leer.nextInt();

        cociente = dividendo / divisor;
        resto = dividendo % divisor;

        System.out.println(dividendo + " entre " + divisor + " da un cociente " + cociente + " y un resto " + resto);


    }
}
