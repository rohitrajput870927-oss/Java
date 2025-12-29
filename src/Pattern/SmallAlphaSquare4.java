package Pattern;
import java.util.Scanner;
public class SmallAlphaSquare4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(j+96));
            }
            System.out.print("\n");
        }

    }
}
