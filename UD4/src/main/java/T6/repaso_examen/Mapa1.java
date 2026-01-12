package repaso_examen;

import java.util.Scanner;
import java.util.HashMap;
public class Mapa1 {
    public static void main(String[] args) {

        HashMap<String,String> mapa = new HashMap<>();

        mapa.put("Manzana" , "Roja");
        mapa.put("Pera" , "Verde");
        mapa.put("Platano" , "Amarillo");

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el nombre de una fruta");
        String fruta = sc.nextLine();

        System.out.println(mapa.get(fruta));

    }
}
