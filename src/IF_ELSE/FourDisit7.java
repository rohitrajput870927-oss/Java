package IF_ELSE;
import java.util.Scanner;
public class FourDisit7 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a=sc.nextInt();

        if(a>999 && a<10000){
            System.out.print("Yes it is four digit ");

        }
        else{
            System.out.print("Not a four digit Number ");
        }

    }
}
