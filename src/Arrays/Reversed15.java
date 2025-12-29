package Arrays;

public class Reversed15 {
    public static void main(String[] args) {
        int[] arr = {8, 4, 3, 0, 5, 2, 15, 83};

        int i = 0;                 // start
        int j = arr.length - 1;    // end

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.print("Reversed Array: ");
        for (int k=0;k<arr.length;k++) {
            System.out.print(arr[k] + " ");
        }

    }
}
