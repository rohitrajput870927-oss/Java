package IF_ELSE;
import java.util.Scanner;
public class TernaryVariable12 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No. ");
        int a=sc.nextInt();
        int p=(a>0) ? 100 : 0;
        System.out.print(p);

    }
}
