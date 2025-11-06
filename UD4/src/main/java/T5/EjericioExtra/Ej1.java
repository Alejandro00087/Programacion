package T5.EjericioExtra;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.printf("Ingresa el numero del dia de la semana que quieres saber \n\t1 - Lunes \n\t2 - Martes \n\t3 - Miercoles \n\t4 - Jueves \n\t5 - Viernes"  );
        int dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("El lunes a primera hora tocaProgramación");
                break;
            case 2:
                System.out.println("El martes a primera hora toca lenguaje de marcas");
                break;
            case 3:
                System.out.println("El miercoles a primera hora toca Ingles");
                break;
            case 4:
                System.out.println("El jueves a primera hora toca sistemas informáticos");
                break;
            case 5:
                System.out.println("El viernes a primera hora toca entornos");
                break;
        }
    }
}
