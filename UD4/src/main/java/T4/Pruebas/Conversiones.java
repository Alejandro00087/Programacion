package T4.Pruebas;

public class Conversiones {
    public static void main(String[] args) {
        // de int a char
        char a = (char) 500; // a es Ǵ
        System.out.println(a);
        // de float a char
        char b = (char) 2000.53f; // b es el caracter ߐ, se pierden los decimales
        System.out.println(b);
        // de float a int
        int c = (int) 14.67565f; // c es 14, se pierden los decimales
        // Formas de convertir variables a String (Concatenar cadena vacía)
        String v1 = "" + 'a'; // v1 es "a"
        String v2 = "" + 865; // v2 es "865"
        String v3 = "" + 23.78f; // v3 es "23.78"
        boolean encontrado = true;
        String v4 = "" + encontrado; // v4 es "true"
        System.out.printf("%s / %s / %s / %s%n", v1, v2, v3, v4);
        // Formas de convertir variables a String (función valueOf)
        String v5 = String.valueOf('a'); // v5 es "a"
        String v6 = String.valueOf(865); // v6 es "865"
        String v7 = String.valueOf(23.78f); // v7 es "23.78"
        String v8 = String.valueOf(encontrado); // v8 es "true"
        System.out.printf("%s / %s / %s / %s%n", v5, v6, v7, v8);
        //No se puede convertir String a Char, pero sí extraer caracteres de una
        //determinada posición
        char v = "Viernes".charAt(0); // v es 'V'
        char l = "Lunes".charAt(4); // l es 's'
        System.out.println("Ejemplo charAt: " + v + " " + l);
        //Conocer longitud de un String
        String var10 = "HOLA COMO ESTAS";
        System.out.println("LENGTH VAR10: " + var10.length());
        //parseInt() y parseFloat()
        String n1 = "213";
        int n11 = Integer.parseInt(n1); // n11 es 213
        String n2 = "23.78";
        float n22 = Float.parseFloat(n2); // n22 es 23.78f
        System.out.println("Ejemplo parseInt: " + n11 + " y parseFloat " + n22);
    }

}