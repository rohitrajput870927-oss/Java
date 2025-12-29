package Pattern;
import java.util.Scanner;
public class NumberTriangleVerticallyFlipped22 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i+1;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print(k);
            }
            System.out.print("\n");
        }
    }
}
