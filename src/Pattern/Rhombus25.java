package Pattern;
import java.util.Scanner;
public class    Rhombus25 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" "+" ");//dono side space hai isliye ye dobar diya gaya hai 
            }
           for(int k=1;k<=n;k++){
               System.out.print("*"+" ");//Square hai isliye ye n tak chalega
           }
           System.out.print("\n");
        }

    }
}
