package Bucles.A;
import java.util.Scanner;
public class ProgramaNotasV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Asignaturas y sus horas totales
        String[] asignaturas = {
                "Programación", "Inglés", "Lenguaje de Marcas",
                "Sistemas Informáticos", "Base de Datos", "Entornos", "Proyecto"
        };

        int[] horasTotales = {266, 68, 100, 166, 166, 100, 34};
        int[] horasFaltadas = new int[asignaturas.length];

        // Pedir al usuario las horas faltadas
        System.out.println("=== Control de faltas (máximo 15%) ===");
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.print("¿Cuántas horas has faltado en " + asignaturas[i] + "?: ");
            horasFaltadas[i] = sc.nextInt();
        }

        System.out.println("\n=== Resultados ===");
        for (int i = 0; i < asignaturas.length; i++) {
            int limiteFaltas = (int) (horasTotales[i] * 0.15);
            int restantes = limiteFaltas - horasFaltadas[i];

            if (restantes > 0) {
                System.out.println("En " + asignaturas[i] + " puedes faltar aún " + restantes + " horas (de un máximo de " + limiteFaltas + ").");
            } else if (restantes == 0) {
                System.out.println("En " + asignaturas[i] + " has llegado al límite de faltas.");
            } else {
                System.out.println("⚠ En " + asignaturas[i] + " te has pasado " + Math.abs(restantes) + " horas del límite de faltas.");
            }
        }

        sc.close();
    }
}
