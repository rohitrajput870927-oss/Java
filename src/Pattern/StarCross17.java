package Pattern;
import java.util.Scanner;
public class StarCross17 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(j==n-i+1 || i==j){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
            }
            System.out.print("\n");
        }
    }
}
