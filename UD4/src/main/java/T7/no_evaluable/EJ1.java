package T7.no_evaluable;
import java.util.*;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce el primer numero");
        double num1 = sc.nextDouble();

        System.out.println("Introduce el segundo numero");
        double num2 = sc.nextDouble();

        double resultado = multiplica(num1,num2);

        System.out.println("El resultado es: " + resultado);

        sc.close();
    }

    public static double multiplica(double num1,double num2){
        double resultado = num1*num2;
        return resultado;
    }
}
