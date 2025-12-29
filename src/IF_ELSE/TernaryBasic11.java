package IF_ELSE;
import java.util.Scanner;
public class TernaryBasic11 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. ");
        int a=sc.nextInt();
        //condition ? sach : jhoot
        System.out.print((a%2==0) ? "Even" : "Odd");
    }
}
