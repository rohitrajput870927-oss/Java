package ArraysPrectice;
import java.util.Scanner;
public class Prictice01 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the element of arr");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The arr is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        System.out.print("The Negative element is :");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i]+" ");
            }


        }
    }
}
