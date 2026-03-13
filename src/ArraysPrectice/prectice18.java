package ArraysPrectice;
import java.util.Scanner;
public class prectice18 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the Size:");
        int n=sc.nextInt();
        int sum=0;
        int[] arr= new int[n];

        System.out.print("Enter the element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The element is:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }

        System.out.println("The Sum of element is:");
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);




    }
}
