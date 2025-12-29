package Loop;
import java.util.Scanner;
public class AllEven1to100No4 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }

        }

    }
}
