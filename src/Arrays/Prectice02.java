package Arrays;
import java.util.Scanner;
public class Prectice02 {
    static void main() {
        int[] arr={8,5,9,4,7};
        Scanner sc=new Scanner(System.in);
        System.out.print("The arr is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        System.out.print("Enter the target:");
        int target=sc.nextInt();
        boolean flag=true;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target) {
                flag=true;
                break;//stop when we found
            }
        }
        if(flag){
            System.out.print("Element is present ");
        }
        else{
            System.out.print("Element is present ");

        }
    }
}
