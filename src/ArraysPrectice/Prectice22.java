package ArraysPrectice;
import java.util.Scanner;
public class Prectice22 {
    static void main() {
        int [] arr={2,3,4,5,6,1,7};
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the target");
        int t=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==t){
                flag=true;
                System.out.println(arr[i]+" "+"index"+i);
                break;
            }

        }
        if(flag){
            System.out.println("exit");
        }
        else{
            System.out.println("not");
        }
    }
}
