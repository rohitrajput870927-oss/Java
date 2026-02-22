package Loop;
import java.util.Scanner;
public class AP7 {
    static void main() {
        //-2,5,8,11.....n
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter the numbe of term");
        int n=sc.nextInt();
        System.out.println("Enter the D");
        int d=sc.nextInt();

        for(int i=a;i<=(3*n-5);i=i+3) {//last term tak chalega means ap=a+(n-1)*d then ap=-2+(n-1)*3=3n-5 tak chalega ok
            System.out.println(i);
        }



    }
}
