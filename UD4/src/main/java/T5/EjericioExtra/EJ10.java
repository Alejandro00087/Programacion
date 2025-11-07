package T5.EjericioExtra;
import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int puntuacion = 0;

        System.out.println("¿Qué selección ganó el Mundial en 2022?");
        System.out.println("a) Francia");
        System.out.println("b) Argentina");
        System.out.println("c) Brasil");
        String respuesta1 = sc.nextLine();
        if (respuesta1.equalsIgnoreCase("b")) {
            puntuacion++;
        }

        System.out.println("¿Cuántos jugadores tiene un equipo de fútbol en el campo?");
        System.out.println("a) 9");
        System.out.println("b) 10");
        System.out.println("c) 11");
        String respuesta2 = sc.nextLine();
        if (respuesta2.equalsIgnoreCase("c")) {
            puntuacion++;
        }

        System.out.println("Qué jugador tiene más Balones de Oro");
        System.out.println("a) Messi");
        System.out.println("b) Rafa Mir");
        System.out.println("c) Cristiano");
        String respuesta3 = sc.nextLine();
        if (respuesta3.equalsIgnoreCase("a")) {
            puntuacion++;
        }

        System.out.println("Qué país organiza la Premier League");
        System.out.println("a) Francia");
        System.out.println("b) Inglaterra");
        System.out.println("c) Brasil");
        String respuesta4 = sc.nextLine();
        if (respuesta4.equalsIgnoreCase("b")) {
            puntuacion++;
        }

        System.out.println("Qué equipo tiene más Champions League");
        System.out.println("a) Madrid");
        System.out.println("b) AC Milan");
        System.out.println("c) Barcelona");
        String respuesta5 = sc.nextLine();
        if (respuesta5.equalsIgnoreCase("a")) {
            puntuacion++;
        }

        System.out.println("Qué equipo ascendió a primera división en la temporada 24/25");
        System.out.println("a) Leganes");
        System.out.println("b) Elche");
        System.out.println("c) Malaga");
        String respuesta6 = sc.nextLine();
        if (respuesta6.equalsIgnoreCase("b")) {
            puntuacion++;
        }

        System.out.println("Qué jugador es conocido como la Pulga");
        System.out.println("a) Insigne");
        System.out.println("b) Messi");
        System.out.println("c) Febas");
        String respuesta7 = sc.nextLine();
        if (respuesta7.equalsIgnoreCase("b")) {
            puntuacion++;
        }

        System.out.println("Qué club español juega en el estadio Wanda Metropolitano");
        System.out.println("a) Atletico de Madrid");
        System.out.println("b) Barcelona");
        System.out.println("c) Malaga");
        String respuesta8 = sc.nextLine();
        if (respuesta8.equalsIgnoreCase("a")) {
            puntuacion++;
        }

        System.out.println("¿Qué selección ganó la Eurocopa 2016?");
        System.out.println("a) Alemania");
        System.out.println("b) Francia");
        System.out.println("c) Portugal");
        String respuesta9 = sc.nextLine();
        if (respuesta9.equalsIgnoreCase("c")) {
            puntuacion++;
        }

        System.out.println("¿Qué selección ganó el Mundial en 2010?");
        System.out.println("a) Francia");
        System.out.println("b) Argentina");
        System.out.println("c) España");
        String respuesta10 = sc.nextLine();
        if (respuesta10.equalsIgnoreCase("c")) {
            puntuacion++;
        }

        System.out.println("Tu puntuación final es " + puntuacion + "/10");
    }
}
