package T5.EjericioExtra;
import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que dia y que mes naciste en formato numero");
        int dia = sc.nextInt();
        int mes = sc.nextInt();

        String Horoscopo = "";

        if (mes == 1 && dia <= 19){
            Horoscopo = "Capricornio";
        }

        else if (mes == 1 && dia >= 20){
            Horoscopo = "Acuario";
        }

        else if (mes == 2 && dia <= 18){
            Horoscopo = "Aquario";
        }

        else if (mes == 2 && dia >= 19){
            Horoscopo = "Piscis";
        }

        else if (mes == 3 && dia <= 20){
            Horoscopo = "Piscis";
        }
        else if (mes == 3 && dia >= 21){
            Horoscopo = "Aries";
        }

        else if (mes == 4 && dia <= 19){
            Horoscopo = "Aries";
        }
        else if (mes == 4 && dia >= 20){
            Horoscopo = "Tauro";
        }

        else if (mes == 5 && dia <= 19){}



    }
}
