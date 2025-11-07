package T5.EjericioExtra;
import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {

        final int SegundosDia = 86400;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una hora (horas y minutos)");
        int horas = sc.nextInt();
        int minutos = sc.nextInt();

        int HorasASegundos = horas * 3600;
        int MinutosASegundos = minutos * 60;
        int Segundos = HorasASegundos + MinutosASegundos;
        int SegundosTranscurridos = SegundosDia - Segundos;

        System.out.println("Faltan " + SegundosTranscurridos + " para llegar a la medianoche");


    }
}
