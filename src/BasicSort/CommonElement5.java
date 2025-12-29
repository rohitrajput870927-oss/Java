package BasicSort;

public class CommonElement5 {
    public static void main(String[] args) {

        int[] a = {1, 1, 1, 2, 3, 5, 5};
        int[] b = {1, 1, 2, 4, 4, 6, 8};
             //Ohdbbxzbb

        //it is use to create c  arr
        int[] c = new int[Math.min(a.length, b.length)];//returns the smaller length of the two arrays.

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {

            if (a[i] == b[j]) {
                c[k] = a[i];
                i++;
                j++;
                k++;
            }
            else if (a[i] < b[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        // Print common elements
        for (int l = 0; l < k; l++) {
            System.out.print(c[l] + " ");
        }
    }
}
