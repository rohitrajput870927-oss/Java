package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class FunctionArray7 {
    static void main() {
        int[] arr=new int[9];
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the arr:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        print(arr);
        Arrays.sort(arr);//sorting ke liye hota hai
        System.out.print("After sorted arr: ");
        print(arr);

    }
    static void print(int[] arr){

        System.out.print("the arr is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
