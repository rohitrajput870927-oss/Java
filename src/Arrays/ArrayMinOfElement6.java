package Arrays;

public class ArrayMinOfElement6 {
    static void main() {
        int[] arr = {8, 9, 10, 2, 3, 4, 5};

        System.out.print("The Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();


        for (int j = 0; j < arr.length; j++) {
            int mn = arr[0],mndx=1;
            for (int i = j; i < arr.length-1; i++) {
                if (arr[i] < mn) {
                    mn = arr[i];
                }
            }
            int temp=arr[j];
            arr[j]=arr[mndx];
            arr[mndx]=temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
