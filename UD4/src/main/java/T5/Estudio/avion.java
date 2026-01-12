public class avion {

    // Atributos
    private float altura;
    private float velocidad;
    private float combustible;
    private int orientacion;

    // Constructor
    public avion(float altura, float velocidad, float combustible, int orientacion) {
        this.altura = altura;
        this.velocidad = velocidad;
        this.combustible = combustible;
        this.orientacion = orientacion;
    }

    // Getters
    public float getAltura() {
        return altura;
    }

    public int getOrientacion() {
        return orientacion;
    }

    public float getCombustible() {
        return combustible;
    }

    // Métodos para mover el avión
    public void virar(int grados) {
        orientacion = (orientacion + grados) % 360;
        consumirCombustible(grados * 0.1f);
    }

    public void ascender(float metros) {
        altura += metros;
        consumirCombustible(metros * 0.3f);
    }

    public void descender(float metros) {
        altura -= metros;
        if (altura < 0) {
            altura = 0;
        }
    }

    // Método privado para consumir combustible
    private void consumirCombustible(float litros) {
        combustible -= litros;
        if (combustible < 0) {
            combustible = 0;
        }
    }
}
