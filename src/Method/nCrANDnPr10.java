package Method;
import java.util.Scanner;
public class nCrANDnPr10 {
    static int fact(int a){
        int f=1;
        for(int i=1;i<=a;i++) {
           f=f*i;

        }
        return f;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.print("Enter the R: ");
        int r=sc.nextInt();
        int ncr=fact(n)/fact((r)*fact(n-r));
        System.out.println(ncr);

    }

}
