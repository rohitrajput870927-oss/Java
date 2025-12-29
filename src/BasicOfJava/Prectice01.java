package BasicOfJava;
import java.util.Scanner;
public class Prectice01 {
    static void main() {
        Scanner n=new Scanner(System.in);
        System.out.println("Take a no.");
        int a=n.nextInt();
        System.out.println(a*a);

        System.out.print("The quebe  of the no.");
        double s=n.nextDouble();
        System.out.println(s*s*s);

        char o='t';
        System.out.println((int)o);


    }
}
