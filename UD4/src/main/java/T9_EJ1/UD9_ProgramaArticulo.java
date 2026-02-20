package T9_EJ1;
public class UD9_ProgramaArticulo {

    public static void main(String[] args) {

        Articulo articulo1 = new Articulo();

        articulo1.nombreArticulo = "Pijama";
        articulo1.precio = 10;
        articulo1.iva = 21;
        articulo1.cuantosQuedan = 50;

        double pvp = articulo1.precio + (articulo1.precio * articulo1.iva / 100.0);

        System.out.println("Artículo: " + articulo1.nombreArticulo +
                " | Precio: " + articulo1.precio + "€" +
                " | IVA: " + articulo1.iva + "%" +
                " | PVP: " + pvp + "€");

        articulo1.precio = 20;

        pvp = articulo1.precio + (articulo1.precio * articulo1.iva / 100.0);

        System.out.println("\nDespués de modificar el precio:");

        System.out.println("Artículo: " + articulo1.nombreArticulo +
                " | Precio: " + articulo1.precio + "€" +
                " | IVA: " + articulo1.iva + "%" +
                " | PVP: " + pvp + "€");
    }
}
