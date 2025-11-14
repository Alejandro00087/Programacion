package T5.BuclesB;
import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("En que año naciste");
        int a=sc.nextInt();

        int edad = 2025 - a;

        for (int i = 1; i <= edad; i++) {
            System.out.println("Has cumplido " + i + " años");
        }

    }
}
