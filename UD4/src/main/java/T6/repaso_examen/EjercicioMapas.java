package repaso_examen;

import java.util.HashMap; // 1. Importar el mapa

public class EjercicioMapas {
    public static void main(String[] args) {

        // 2. CREAR EL MAPA: <Tipo de la Clave, Tipo del Valor>
        // En este caso: <Nombre del producto, Precio>
        HashMap<String, Double> productos = new HashMap<>();

        // 3. GUARDAR DATOS (.put)
        productos.put("Pan", 0.50);
        productos.put("Leche", 1.20);
        productos.put("Manzana", 0.40);

        // 4. CONSULTAR UN DATO (.get)
        // Tú le das la clave ("Pan") y él te devuelve el valor (0.50)
        String buscar = "Leche";
        System.out.println("El precio de " + buscar + " es: " + productos.get(buscar));

        // 5. COMPROBAR SI EXISTE (.containsKey)
        if (productos.containsKey("Chocolate")) {
            System.out.println("Tenemos chocolate.");
        } else {
            System.out.println("No nos queda chocolate.");
        }

        // 6. RECORRER EL MAPA (Usando For-Each)
        // Para recorrerlo hay que pedirle el "juego de llaves" (keySet)
        System.out.println("\n--- LISTA DE PRECIOS ---");
        for (String nombre : productos.keySet()) {
            System.out.println("Producto: " + nombre + " | Precio: " + productos.get(nombre));
        }
    }
}