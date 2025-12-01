package T6.A;

public class EJ14 {
    public static void main(String[] args) {

        int tamaño = 0;
        for (int i = 1; i <= 10; i++) {
            tamaño += i;
        }

        int[] array = new int[tamaño];
        int indice = 0;

        for (int num = 1; num <= 10; num++) {
            for (int rep = 0; rep < num; rep++) {
                array[indice] = num;
                indice++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
