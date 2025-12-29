package ArraysPrectice;

public class Prectice10 {
    static void main() {
        int[] arr = {7, 4, 5, 0, 2, 4, 6, 2, 19, 65};
        print(arr,0,2);
        System.out.print("\n");
        print(arr,3, arr.length-1);
        System.out.print("\n");
        print(arr,0,arr.length-1);



    }

    static void print(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
