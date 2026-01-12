package repaso_examen;

public class EJ11 {
    public static void main(String[] args) {
        int[] primero = new int[100];
        int[] segundo = new int[100];

        // 2. Llenar el primer array con valores del 1 al 100 [cite: 165]
        for (int i = 0; i < primero.length; i++) {
            primero[i] = i + 1; // Guardamos 1 en la pos 0, 2 en la pos 1... [cite: 135]
        }

        // 3. Copiar al segundo array en orden inverso [cite: 221]
        // El primer elemento de 'segundo' (índice 0) debe ser el último de 'primero' (índice 99)
        for (int i = 0; i < primero.length; i++) {
            // Fórmula: 99 - i va dándonos 99, 98, 97... a medida que i sube
            segundo[i] = primero[99 - i];
        }

        // 4. Mostrar ambos por pantalla usando un recorrido simple [cite: 169, 170]
        System.out.println("Array original:");
        for (int i = 0; i < primero.length; i++) {
            System.out.print(primero[i] + " ");
        }

        System.out.println("\nArray inverso:");
        for (int i = 0; i < segundo.length; i++) {
            System.out.print(segundo[i] + " ");
        }
    }
}
