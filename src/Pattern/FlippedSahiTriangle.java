package Pattern;
import java.util.Scanner;
public class FlippedSahiTriangle {
    static void main() {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){//i=1 se start hua hai to j=n-i+1 tak chalega hi fir i=2 pe jayega
                    System.out.print("*");
                }
                System.out.print("\n");
            }
    }
}
