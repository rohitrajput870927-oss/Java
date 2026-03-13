package ArraysPrectice;
import java.util.Arrays;
import java.util.Scanner;
public class Prectice01 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        h(arr);
        System.out.println("arr after sorting:");
        Arrays.sort(arr);
        h(arr);


    }
    static void h(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }

}
