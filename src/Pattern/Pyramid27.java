package Pattern;
import java.util.Scanner;

public class Pyramid27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Print TWO spaces (same as C++ " " << " ")
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");  // two spaces
            }

            // Print star + space (same as C++ "* ")
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*" + " ");  // star + space
            }

            System.out.println();
        }
    }
}
