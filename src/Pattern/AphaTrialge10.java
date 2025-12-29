package Pattern;
import java.util.Scanner;
public class AphaTrialge10 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64));
            }
            System.out.print("\n");
        }
    }
}
