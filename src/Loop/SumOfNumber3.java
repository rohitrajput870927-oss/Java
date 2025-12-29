package Loop;
import java.util.Scanner;
public class SumOfNumber3 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  the Number: ");
        int n=sc.nextInt();
        int sum=0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);
    }
}
