package Pattern;
import java.util.Scanner;
public class HW26 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n-i+1;k++){
                System.out.print("*");
            }
            System.out.print("\n") ;
        }
    }
}
