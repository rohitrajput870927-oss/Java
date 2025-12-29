package IF_ELSE;
import java.util.Scanner;
public class AbsoluteValue3 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No. :");
        int a=sc.nextInt();
        if(a>0){
            System.out.print(a);

        }
        else{
            System.out.print(-(a));
        }

    }

}
