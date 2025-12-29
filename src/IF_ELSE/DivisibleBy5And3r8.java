package IF_ELSE;
import java.util.Scanner;
public class DivisibleBy5And3r8 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No.: ");
        int a=sc.nextInt();

        if(a%5==0 && a%3==0){
            System.out.print("Pritish");
        }
        else if(a%3==0 ){
            System.out.print("Rohan");
        }

        else if(a%5==0 ){
            System.out.print("Sagar");
        }


        else {
            System.out.print("Sagar and Faisal");
        }
    }
}
