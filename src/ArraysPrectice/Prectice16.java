package ArraysPrectice;
import java.util.Scanner;
public class Prectice16 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of arr: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Element:");
        for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("/n");
        int [] r=new int[4];
        for(int i=0;i<r.length;i++){
            System.out.println(r[i]+" ");
        }

    }
}
