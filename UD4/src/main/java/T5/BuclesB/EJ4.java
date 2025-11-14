import java.util.Scanner;
public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        if (num > 0) {
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
        } else {
            num = Math.abs(num);
            for (int i = 0; i < num; i++) {
                System.out.print("#");
            }
        }
    }
}
