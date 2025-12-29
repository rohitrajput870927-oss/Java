package IF_ELSE;
import java.util.Scanner;
public class GreatestOfThree9 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first No.");
        int a=sc.nextInt();
        System.out.print("Enter the Second No.");
        int b=sc.nextInt();
        System.out.print("Enter the Threed No. ");
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.print(a+"Greater No.");
        }
        else if(b>=a && b>=c){
            System.out.print(b+"Greatest No.");
        }
        else{
            System.out.print(c+"Greatest No.");
        }

    }
}
