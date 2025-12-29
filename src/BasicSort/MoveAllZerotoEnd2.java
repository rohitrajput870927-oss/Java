package BasicSort;

public class MoveAllZerotoEnd2 {
    static void main() {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        for(int j=0;j< arr.length;j++)
        for(int i=0;i< arr.length-1;i++){
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

            }
        }
        for (int p = 0; p < arr.length; p++) {
            System.out.print(arr[p] + " ");
        }
    }
}
