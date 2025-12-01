package T6.A;

public class EJ11 {

    public static void main(String[] args) {

        int[] array1 = new int[100];
        int[] array2 = new int[100];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[array1.length - 1 - i];
        }

        System.out.println("Array 1 (1 al 100):");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\n\nArray 2 (inverso):");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
