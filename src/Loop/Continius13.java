package Loop;
import java.util.Scanner;
public class Continius13 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            if(i%2!=0){
                continue;//skeep this
            }
            System.out.print(i+" ");
        }
    }
}
