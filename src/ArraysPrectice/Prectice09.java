package ArraysPrectice;

public class Prectice09 {
    static void main() {
        int[] arr = {8, 7, 4, 3, 19, 6, 3, 2};
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}

