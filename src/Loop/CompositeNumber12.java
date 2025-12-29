package Loop;
import java.util.Scanner;
public class CompositeNumber12 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        boolean flag=true;//true means prime
        for(int i=2;i<=n-1;i++) {
            if (n % i == 0) {
                flag = false;
//                System.out.print("Comp");//Composite number → has more than 2 factors
                break;
            }

        }
        if(n==1){
            System.out.print("Prime");
        }
        else if(flag==false){
            System.out.print("Compo");

        }
        else{
            System.out.print("Prime");
        }
    }
}
