package IF_ELSE;
import java.util.Scanner;
public class OddEvenNo2 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No.:  ");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.print("Even Number");
        }
        else{
            System.out.print("Odd Number");

        }

    }
}
