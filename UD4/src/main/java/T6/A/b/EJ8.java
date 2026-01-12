import java.util.Random;

public class EJ8 {
    public static void main(String[] args) {

        int numPaises = 4;
        int numEstaturas = 10;
        int min = 140;
        int max = 210;

        String[] paises = {"España", "Alemania", "Francia", "Italia"};

        int anchoPais = 0;
        for (String pais : paises) {
            if (pais.length() > anchoPais) {
                anchoPais = pais.length();
            }
        }

        int[][] estaturas = new int[numPaises][numEstaturas];
        Random rand = new Random();

        for (int i = 0; i < numPaises; i++) {
            for (int j = 0; j < numEstaturas; j++) {
                estaturas[i][j] = rand.nextInt(max - min + 1) + min;
            }
        }


        int espaciosAntesCabecera = anchoPais + 1 + (numEstaturas * 4);
        for (int i = 0; i < espaciosAntesCabecera; i++) {
            System.out.print(" ");
        }
        System.out.println("MED  MIN  MAX");

        for (int i = 0; i < numPaises; i++) {

            System.out.printf("%-" + anchoPais + "s ", paises[i]);

            int suma = 0;
            int minimo = 300;
            int maximo = 0;

            for (int j = 0; j < numEstaturas; j++) {
                int e = estaturas[i][j];
                System.out.printf("%4d", e);
                suma += e;
                if (e < minimo) minimo = e;
                if (e > maximo) maximo = e;
            }

            int media = suma / numEstaturas;

            System.out.printf("  %3d %3d %3d\n", media, minimo, maximo);
        }
    }
}
