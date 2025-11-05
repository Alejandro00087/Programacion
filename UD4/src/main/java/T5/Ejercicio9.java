package T5;
import java.util.Scanner;


public class Ejercicio9 {
    public static void main(String[] args) {

        String clave = "thebest";

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la contraseña");
        String pass = sc.nextLine();

        if (clave.equalsIgnoreCase(pass)){
            System.out.println("La contraseña coincide");
        }
        else{
            System.out.println("La contraseña no coincide");
        }

    }
}
