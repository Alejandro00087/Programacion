package T5.Estudio;

public class ej1 {
    public static void main(String[] args) {

        for (int num = 1; num <= 20; num++) {
            System.out.println(num);
        }

        String texto = "Hola Mundo";
        String primera = texto.substring(0, texto.indexOf(" "));
        System.out.println(primera); // "Hola"

        String frase = "Hola mundo programador";
        String ultima = frase.substring(frase.lastIndexOf(" ")+ 1);
        System.out.println(ultima);

        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma += i;  // suma = suma + i
        }

        System.out.println(suma);



    }
}
