package BasicSort;

import java.util.Arrays;

public class Sum2_6 {
    public static void main(String[] args) {

        int[] arr = {7, 0, 4, 3, 2, 8, 10,5};
        Arrays.sort(arr);   // sort array

        int target = 9;
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum > target) {
                j--;
            }
            else if (sum < target) {
                i++;
            }
            else {
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            }
        }
    }
}
