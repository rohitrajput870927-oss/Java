package BasicSort.Prectice;

public class Prectice02 {
    static void main() {
        int [] arr={1,2,3,5,0,2,0,0,7,6};
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]==0) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
