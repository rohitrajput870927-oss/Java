package IF_ELSE;
import java.util.Scanner;
public class ProfitOrLoss5 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Cost Price: ");
        int c=sc.nextInt();
        System.out.print("Enter the Selling Price: ");
        int s=sc.nextInt();
        if(c>s){
            System.out.print("It get Loss: "+(s-c));
        }
        else if(c<s){
            System.out.print("Profit :"+(s-c));

        }
        else{
            System.out.print("No loss No Profit");
        }


    }
}
