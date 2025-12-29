package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class EvenOdd10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The arr is:");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(2 * arr[i] + " ");
            }

            if(i%2!=0){
                System.out.print(arr[i] + 10 + " ");
            }


        }

    }
}
