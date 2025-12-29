package Pattern;
import java.util.Scanner;
public class FloydsTriangle18 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;

            }
            System.out.print("\n");
        }
    }
}
