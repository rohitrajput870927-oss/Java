package Loop;
import java.util.Scanner;
import java.lang.Math;
public class aPowerb15 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        int sq=(int)Math.pow(a,b);//dicimal neaye isliye
        System.out.print(sq);


    }
}
