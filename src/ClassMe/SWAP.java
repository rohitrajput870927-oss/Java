package ClassMe;
import java.util.Scanner;
public class SWAP {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        System.out.println("a:"+" "+a+" "+"b "+b);
        System.out.println("after swap");

        int temp=a;
        a=b;
        b=temp;
        System.out.println("a:"+" "+a+" "+"b "+b);

    }
}

