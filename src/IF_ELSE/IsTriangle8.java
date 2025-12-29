package IF_ELSE;
import java.util.Scanner;
public class IsTriangle8 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Side ");
        double a=sc.nextDouble();
        System.out.print("Enter the  second Side");
        double b=sc.nextDouble();
        System.out.print("Enter the threed Side");
        double c=sc.nextDouble();
        if(a+b>c && a+c>b && c+b>a){//Sum of Two Side is Equal TO threed No.
            System.out.print("Yes it is a triangle");
        }
        else{
            System.out.print("Not a valid triangle");
        }


    }
}
