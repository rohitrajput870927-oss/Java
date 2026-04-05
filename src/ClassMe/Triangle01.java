package ClassMe;
import java.util.Scanner;
public class Triangle01 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number ");
        int a=sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int k=0;k<i;k++){
                System.out.print(" ");
            }
            for (int j =i ; j <a;j++) {
                System.out.print("*");

            }
            System.out.println();

        }


    }
}
