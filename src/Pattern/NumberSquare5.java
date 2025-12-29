package Pattern;
import java.util.Scanner;
public class NumberSquare5 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
