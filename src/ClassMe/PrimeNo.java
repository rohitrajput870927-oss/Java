package ClassMe;
import java.util.Scanner;
public class PrimeNo {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int a=sc.nextInt();
        boolean isPrime=true;
        if(a<=1){
            isPrime=false;
        }
        else {
            for (int i = 2; i <= a/2; i++) {
                if(a%i==0){
                    isPrime=true;
                    System.out.println("yes");
                }


            }
        }
    }


}
