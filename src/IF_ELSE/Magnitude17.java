package IF_ELSE;
import java.util.Scanner;
public class Magnitude17 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No. ");
        int a=sc.nextInt();
        if(a>0){
            if(a>69) {
                System.out.print("a is Greater No.");
            }
            else{
                System.out.print("a is less Then 69");
            }
        }
        else{
            int c=-(a);
            if(c>69){
                System.out.print("a is Greater No.");
            }
            else{
                System.out.print("a is less then 69");
            }
        }
    }
    }

