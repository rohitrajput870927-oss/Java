package Arrays;
import java.util.Scanner;

public class LinearSearch11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        boolean flag = false; // target not found initially

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nEnter target element: ");
        int target = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                flag = true;
                System.out.println(i);//for index
//                 break;// stop when found tab lagayege jab hame dublicete element nahi chahiye agar isame break lagayege to 1,2,3,1 to 0 index wala hi print hoga
            }
        }

        if (flag) {
            System.out.println("Exist");
        } else {
            System.out.println("Not Exist");
        }
    }
}
