package Loop.WhileLoop;
import java.util.Scanner;
public class ReverseOfNumber2 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int r=0;//remainder hai ye
        while(n>0){
            int ld=n%10;
            r=r*10;
            r=r+ld;
            n=n/10;//ye condition ke liye hai
        }
        System.out.print(r);

    }
}
