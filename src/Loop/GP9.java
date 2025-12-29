package Loop;
import java.lang.Math;
import java.util.Scanner;

public class GP9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Term: ");
        int a = sc.nextInt();

        System.out.print("Enter the Common Ratio: ");
        int r = sc.nextInt();

        System.out.print("Enter the Number of Terms: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int g = (int)(a * Math.pow(r, i));//if i not give the int then it print in decimal
//            int g = a * Math.pow(r, i);  // ❌ error: cannot convert double to int

            System.out.print(g + " ");
        }
    }
}
