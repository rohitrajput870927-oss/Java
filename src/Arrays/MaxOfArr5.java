package Arrays;
import java.util.Scanner;
public class MaxOfArr5 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int[] arr=new int[n];//intial the arr
        int a=arr.length;
        int max=arr[0];
        System.out.print("Enter the element: ");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The arr is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        System.out.print("Max Element: ");
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.print(max);

    }
}
