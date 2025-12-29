package Loop;
import java.util.Scanner;
public class Factorial14 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.print(fact);
    }
}
