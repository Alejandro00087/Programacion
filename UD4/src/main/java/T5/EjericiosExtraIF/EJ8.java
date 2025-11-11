package T5.EjericiosExtraIF;
import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime qué día y qué mes naciste en formato número:");
        int dia = sc.nextInt();
        int mes = sc.nextInt();

        String Horoscopo = "";

        if (mes == 1 && dia <= 19) {
            Horoscopo = "Capricornio";
        }
        else if (mes == 1 && dia >= 20) {
            Horoscopo = "Acuario";
        }
        else if (mes == 2 && dia <= 18) {
            Horoscopo = "Acuario";
        }
        else if (mes == 2 && dia >= 19) {
            Horoscopo = "Piscis";
        }
        else if (mes == 3 && dia <= 20) {
            Horoscopo = "Piscis";
        }
        else if (mes == 3 && dia >= 21) {
            Horoscopo = "Aries";
        }
        else if (mes == 4 && dia <= 19) {
            Horoscopo = "Aries";
        }
        else if (mes == 4 && dia >= 20) {
            Horoscopo = "Tauro";
        }
        else if (mes == 5 && dia <= 20) {
            Horoscopo = "Tauro";
        }
        else if (mes == 5 && dia >= 21) {
            Horoscopo = "Géminis";
        }
        else if (mes == 6 && dia <= 20) {
            Horoscopo = "Géminis";
        }
        else if (mes == 6 && dia >= 21) {
            Horoscopo = "Cáncer";
        }
        else if (mes == 7 && dia <= 22) {
            Horoscopo = "Cáncer";
        }
        else if (mes == 7 && dia >= 23) {
            Horoscopo = "Leo";
        }
        else if (mes == 8 && dia <= 22) {
            Horoscopo = "Leo";
        }
        else if (mes == 8 && dia >= 23) {
            Horoscopo = "Virgo";
        }
        else if (mes == 9 && dia <= 22) {
            Horoscopo = "Virgo";
        }
        else if (mes == 9 && dia >= 23) {
            Horoscopo = "Libra";
        }
        else if (mes == 10 && dia <= 22) {
            Horoscopo = "Libra";
        }
        else if (mes == 10 && dia >= 23) {
            Horoscopo = "Escorpio";
        }
        else if (mes == 11 && dia <= 21) {
            Horoscopo = "Escorpio";
        }
        else if (mes == 11 && dia >= 22) {
            Horoscopo = "Sagitario";
        }
        else if (mes == 12 && dia <= 21) {
            Horoscopo = "Sagitario";
        }
        else if (mes == 12 && dia >= 22) {
            Horoscopo = "Capricornio";
        }
        else {
            Horoscopo = "Fecha no válida";
        }

        System.out.println("Tu horóscopo es: " + Horoscopo);
    }
}
