package ClassMe;
import java.util.Scanner;
public class EvenOdd {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x%2==0){
            System.out.println("It is Even");
        }
        else{
            System.out.println("It is Odd");
        }

    }
}
