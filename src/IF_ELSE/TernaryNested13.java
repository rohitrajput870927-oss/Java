package IF_ELSE;
import java.util.Scanner;
public class TernaryNested13 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first No.");
        int a=sc.nextInt();
        System.out.print("Enter the Second No.");
        int b=sc.nextInt();
        System.out.print("Enter the Threed No. ");
        int c=sc.nextInt();
        int gr=(a>b) ? ((a>c) ? a : c) :((b>c) ? b :c);
        System.out.print(gr);
    }
}
