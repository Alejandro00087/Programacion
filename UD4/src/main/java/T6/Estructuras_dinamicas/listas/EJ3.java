package T6.Estructuras_dinamicas.listas;

import java.util.Arrays;

public class EJ3 {
    public static void main(String[] args) {

        int[] listaOriginal = {15, 10, 25, 33, 10, 15, 18, 19, 14, 17};

        int[] listaMenorMayor = listaOriginal.clone();
        int[] listaMayorMenor = listaOriginal.clone();

        Arrays.sort(listaMenorMayor);

        Arrays.sort(listaMayorMenor);
        for (int i = 0; i < listaMayorMenor.length / 2; i++) {
            int temp = listaMayorMenor[i];
            listaMayorMenor[i] = listaMayorMenor[listaMayorMenor.length - 1 - i];
            listaMayorMenor[listaMayorMenor.length - 1 - i] = temp;
        }

        System.out.println("Lista original: " + Arrays.toString(listaOriginal));
        System.out.println("Lista ordenada de menor a mayor: " + Arrays.toString(listaMenorMayor));
        System.out.println("Lista ordenada de mayor a menor: " + Arrays.toString(listaMayorMenor));
    }
}
