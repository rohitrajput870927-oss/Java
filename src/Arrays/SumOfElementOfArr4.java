package Arrays;
import java.util.Scanner;
public class SumOfElementOfArr4 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        int sum=0;
        //creating arr
        int[] arr=new int[n];
        int a=arr.length;
        System.out.println("Enter the element: ");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        //print
        System.out.println("The arr is: ");
        for(int i=0;i<a;i++){
            sum=sum+arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        System.out.print(sum);
    }
}
