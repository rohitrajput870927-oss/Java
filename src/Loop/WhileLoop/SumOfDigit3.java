package Loop.WhileLoop;
import java.util.Scanner;
public class SumOfDigit3 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int LD=n%10;
            sum=sum+LD;//sum karega fir niche condition check karega
            n=n/10;//

        }
        System.out.print(sum);
        }
    }

