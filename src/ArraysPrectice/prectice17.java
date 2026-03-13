package ArraysPrectice;
import java.util.Scanner;
public class prectice17 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arr:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("THe element is:");
        for(int i=0;i<n;i++){
            if(arr[i]<0) {
                System.out.print(arr[i] + " ");
            }

        }


    }
}
