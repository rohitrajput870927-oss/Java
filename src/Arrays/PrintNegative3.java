package Arrays;
import java.util.Scanner;
public class PrintNegative3 {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of arr: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        int a=arr.length;
        //input
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        //print
        for(int i=0;i<a;i++){
            if(arr[i]<0) {
                System.out.print(arr[i]+" ");
            }
        }

    }
}
