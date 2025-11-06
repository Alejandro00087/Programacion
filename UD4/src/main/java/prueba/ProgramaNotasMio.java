package prueba;
import java.util.Scanner;
public class ProgramaNotasMio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int PROGRAMACION = 266;
        int INGLES = 68;
        int LENGUAJE_MARCAS = 100;
        int SISTEMAS_INFORMATICOS = 166;
        int BASE_DE_DATOS = 166;
        int ENTORNOS = 100;
        int PROYECTO = 34;

        System.out.print("Cuantas horas has faltado en Programación: ");
        int horasP = sc.nextInt();
        System.out.print("Cuantas horas has faltado en Ingles: ");
        int horasI = sc.nextInt();
        System.out.print("Cuantas horas has faltado en Lenguaje de marcas: ");
        int horasL = sc.nextInt();
        System.out.print("Cuantas horas has faltado en Sistemas informaticos: ");
        int horasS = sc.nextInt();
        System.out.print("Cuantas horas has faltado en proyecto: ");
        int horasProyecto = sc.nextInt();
        System.out.print("Cuantas horas has faltado en entornos: ");
        int horasEn = sc.nextInt();
        System.out.print("Cuantas horas has faltado en Base de datos: ");
        int horasB = sc.nextInt();

        int restantesPr = (int) (PROGRAMACION * 0.15) - horasP;
        int restantesI = (int) (INGLES * 0.15) - horasI;
        int restantesL = (int) (LENGUAJE_MARCAS * 0.15) - horasL;
        int restantesS = (int) (SISTEMAS_INFORMATICOS * 0.15) - horasS;
        int restantesProyecto  = (int) (PROYECTO * 0.15) - horasProyecto;
        int restantesEn = (int) (ENTORNOS * 0.15) - horasEn;
        int restantesB = (int) (BASE_DE_DATOS * 0.15) - horasB;

        System.out.println("Te quedan " + restantesPr + " horas para faltar en Programacion nn disfruta");
        System.out.println("Te quedan " + restantesI + " horas para faltar en Ingles nn disfruta");
        System.out.println("Te quedan " + restantesL + " horas para faltar en Lenguaje de marcas, PUTISIMA JESSI");
        System.out.println("Te quedan " + restantesS + " horas para faltar en Sistemas informaticos nn disfruta");
        System.out.println("Te quedan " + restantesProyecto + " horas para faltar en Proyecto");
        System.out.println("Te quedan " + restantesEn + " horas para faltar en Entornos nn disfruta");
        System.out.println("Te quedan " + restantesB + " horas para faltar en Base de datos");

    }

}
