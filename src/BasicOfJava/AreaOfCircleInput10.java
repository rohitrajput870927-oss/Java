package BasicOfJava;
import java.util.Scanner;
public class AreaOfCircleInput10 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double r = sc.nextDouble();
        double a = 3.14*r*r;
        System.out.print("Area of circle: ");
        System.out.print(a);

    }
}
