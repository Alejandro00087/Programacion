package T7.no_evaluable;
import java.util.*;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un valor en kilometros");
        double kilometros = sc.nextDouble();

        double kilometros_a_millas = resultado(kilometros);

        System.out.println("Son " + kilometros_a_millas + " millas");



    }

    public static double resultado(double kilometros){
        double conversion = kilometros/1.60934;
        return conversion;
    }
}
