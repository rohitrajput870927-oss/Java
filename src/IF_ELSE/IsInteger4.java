package IF_ELSE;
import java.util.Scanner;
public class IsInteger4 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No.");
        double a=sc.nextDouble();
        int x=(int)a;//Double ko integer me convert kiya gaya hia
        if(a-x>0){//3.9-3=0.9
            System.out.print("It is not an integer");

        }
        else{
            System.out.print("Integer");
        }
    }
}
