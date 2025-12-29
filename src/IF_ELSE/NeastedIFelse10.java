package IF_ELSE;
import java.util.Scanner;
public class NeastedIFelse10 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first No.");
        int a=sc.nextInt();
        System.out.print("Enter the Second No.");
        int b=sc.nextInt();
        System.out.print("Enter the Threed No. ");
        int c=sc.nextInt();
        if(a>b) {
            if (a > c) {
                System.out.print("a is Ggreater No.");
            }
            else {
                System.out.print("C is greater No.");
            }
          }
        else{
            if(b>c){
                System.out.print("B is Greater No.");
            }
            else{
                System.out.print("C is greater no.");
            }

        }
    }
}
