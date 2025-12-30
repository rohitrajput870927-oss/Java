package BasicSort;

public class KthSmallest6 {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        for (int i = 0; i < k; i++) {
            int min = arr[i];
            int mindx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }

        for (int p = 0; p < arr.length; p++) {
            System.out.print(arr[p] + " ");
        }

        System.out.println();
        System.out.println("Kth smallest element: " + arr[k - 1]);
    }
}
