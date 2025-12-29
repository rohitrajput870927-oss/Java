package Loop;
import java.util.Scanner;
public class AP8 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter the numbe of term");
        int n=sc.nextInt();
        System.out.println("Enter the D");
        int d=sc.nextInt();
        for(int i=0;i<n;i++){
            int c=a+i*d;//i==0 isliye hua hai taki a+0*d=a aa jayega jo ki hamara first term hai
            System.out.println(c);
        }
    }
}
