package T7.ejercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la lista de números separados por espacios:");
        String input = scanner.nextLine();
        String[] numbersArray = input.split(" ");

        ArrayList<Integer> numbersList = new ArrayList<>();
        for (String number : numbersArray) {
            numbersList.add(Integer.parseInt(number));
        }

        System.out.println("Introduce el divisor:");
        int divisor = scanner.nextInt();

        ArrayList<Integer> result = reorganizarPorMultiplos(numbersList, divisor);

        System.out.println("Lista reorganizada:");
        for (int number : result) {
            System.out.print(number + " ");
        }

        scanner.close();
    }

    public static ArrayList<Integer> reorganizarPorMultiplos(ArrayList<Integer> numbersList, int divisor) {
        ArrayList<Integer> multiplesOfDivisor = new ArrayList<>();
        ArrayList<Integer> otherNumbers = new ArrayList<>();

        for (int number : numbersList) {
            if (number % divisor == 0) {
                multiplesOfDivisor.add(number);
            } else {
                otherNumbers.add(number);
            }
        }

        multiplesOfDivisor.addAll(otherNumbers);

        return multiplesOfDivisor;
    }
}