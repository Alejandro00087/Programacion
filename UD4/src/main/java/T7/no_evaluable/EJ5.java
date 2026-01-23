package T7.no_evaluable;
import java.util.*;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un valor en millas");
        double millas = sc.nextDouble();

        double millas_a_kilometros = resultado(millas);

        System.out.println("Son " + millas_a_kilometros + " kilometros");



    }

    public static double resultado(double millas){
        double conversion = millas*1.60934;
        return conversion;
    }
}
