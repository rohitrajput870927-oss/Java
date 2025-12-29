package Pattern;
import java.util.Scanner;
public class Square1 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");//i=1 pe j=1,2,3,4 pur condition complete kar ke phir i=2 pe jayega or aaise hi chalate rahega
            }
            System.out.print("\n");//j complete hone ke baad line change karne ke liye hota hai
        }
    }
}
