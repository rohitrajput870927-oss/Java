package BasicOfJava;
import java.util.Scanner;
public class SimpleIntrest12 {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Principle");
        int p=sc.nextInt();

        System.out.println("Enter the rate");
        double r=sc.nextInt();

        System.out.println("Enter the time");
        int t=sc.nextInt();

        double SI=(p*r*t)/100;
        System.out.println(SI);





    }
}
