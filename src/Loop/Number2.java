package Loop;
import java.util.Scanner;
public class Number2 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){

            System.out.println(i);
        }//        System.out.print(i);//ye error dega kayoki loop ke inside me hi declare kiye hai log

    }
}
