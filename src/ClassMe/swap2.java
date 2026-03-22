package ClassMe;
import java.util.Scanner;
public class swap2 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no");
        int a=sc.nextInt();
        System.out.println("Enter the second no.");
        int b=sc.nextInt();
        System.out.println("The first no."+" "+a+" "+"The second no."+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap:");
        System.out.println("The first no."+" "+a+" "+"The second no."+" "+b);

    }
}
