package T5.EjericiosExtraIF;
import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la altura desde la que cae el objeto");
        double altura = sc.nextDouble();

        double tiempo = Math.sqrt((2.0*altura/9.81));

        System.out.printf("El objeto tarda en caer %.2f" , tiempo );
    }
}
