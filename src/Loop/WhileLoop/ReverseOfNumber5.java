package Loop.WhileLoop;
import java.util.Scanner;
public class ReverseOfNumber5 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        while(n>0){
            int ld=n%10;
            n=n/10;
            System.out.print(ld);
        }
    }
}
