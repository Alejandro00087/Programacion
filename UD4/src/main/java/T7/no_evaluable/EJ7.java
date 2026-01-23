package T7.no_evaluable;
import java.util.*;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el ancho");
        double ancho = sc.nextDouble();

        System.out.println("Dime el altura");
        double altura = sc.nextDouble();

        double perimetro = perimetroRectangulo(ancho, altura);

        double area = areaRectangulo(ancho, altura);

        System.out.println("El area del rectangulo es: " + area + " y el perimetro es: " + perimetro);


    }

    public static double perimetroRectangulo(double ancho, double altura) {
        double perimetro = 2*(ancho+altura);
        return perimetro;

    }

    public static double areaRectangulo(double ancho, double altura) {
        double area = ancho*altura;
        return area;
    }
}
