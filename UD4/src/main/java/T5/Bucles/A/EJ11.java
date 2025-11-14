package T5.Bucles.A;

public class EJ11 {
    public static void main(String[] args) {

        int pares = 0;
        int impares = 0;

        for (int i = 100; i <=200; i++){
            if (i % 2 == 0){
                pares += i;
            }

            else {
                impares += i;
            }
        }

        System.out.println("Pares: " + pares + " Impares: " + impares);
    }
}
