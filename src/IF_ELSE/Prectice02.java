package IF_ELSE;
import java.util.Scanner;
public class Prectice02 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first Number:");
        int a=sc.nextInt();
        System.out.print("Enter the second Number:");
        int b=sc.nextInt();
        if(a>0){
            if(a>b){
                System.out.print("a  is Greater then b");
            }
            else {
                System.out.print("b is greater then b");
            }
        }
        else{
            int c=-(a);
            if(c>b){
                System.out.print("a is greater then b");

            }
            else{
                System.out.print("b is greater then a");
            }
        }


    }
}
