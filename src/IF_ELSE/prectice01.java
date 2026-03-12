package IF_ELSE;
import java.util.Scanner;
public class prectice01 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number");
        int x=sc.nextInt();
        if(x%2==0){
            System.out.print("Yes the number is Even");

        }
        else{
            System.out.print("No it is not a Even");
        }


    }
}
