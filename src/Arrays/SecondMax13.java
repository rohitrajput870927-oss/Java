package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class SecondMax13 {
    static void main() {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int ma=arr[0];
        int ma2=arr[0];
        System.out.print("Enter the element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The arr is");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("The second max is:");
        for(int i=0;i<n;i++){
            if(arr[i]>ma){
                ma=arr[i];
            }
        }
        System.out.print(ma);
        System.out.print("The second max is");
        for(int i=0;i<n;i++){
            if(arr[i]>ma2){
                if(ma==arr[i]){
                    continue;
                }
                else{
                    ma2=arr[i];
                }
            }
        }
        System.out.print(ma2);

    }
}
