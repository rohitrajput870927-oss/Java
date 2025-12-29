package Pattern;
import java.util.Scanner;
public class TriangleVerticallyFlipped21 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // spaces before numbers
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  "); // two spaces
            }
            // numbers with gap
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");

            }
            System.out.println();
        }
    }
}

