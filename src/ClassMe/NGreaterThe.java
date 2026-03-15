package ClassMe;
import java.util.Scanner;

public class NGreaterThe {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Java");
        }
        else if(n==0){
            System.out.println("C++");

        }
        else if(n==10){
            System.out.println("Python");
        }
        else if(n>10){
            System.out.println("c#");
        }
        else if(n>0 && n<10){
            System.out.println("Rohit");

        }


    }
}
