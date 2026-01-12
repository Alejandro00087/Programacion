package repaso_examen;
import java.util.*;

public class traductor {
    public  static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        HashMap<String, String> traductor = new HashMap<>();

        traductor.put("rojo", "red");
        traductor.put("verde", "green");
        traductor.put("azul", "blue");

        System.out.println("Dime un color en español");
        String palabra=sc.nextLine().toLowerCase();

        String traduccion = traductor.get(palabra);

        if(traduccion!=null){
            System.out.println("La traduccon de a" + palabra + " es " + traduccion);
        }

        else{
            System.out.println("Esa palabra no esta en el diccionario");
        }

        System.out.println("Total de palabras" + traductor.size());







    }
}
