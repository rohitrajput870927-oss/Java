package Pattern;
import java.util.Scanner;
public class Bridge28 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*(a-i);k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}
