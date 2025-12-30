package BasicSort;

public class SelectionSortLargestFirst9 {
    //arr={8,4,1,9,-3,6,5}
    //see the largest element and swap with there last one
    //first 9 is swap with 5
    //arr={8,4,1,5,-3,6,9}
    // now see make oreration in  arr={8,4,1,5,-3,6}
    static void main() {
        int[] arr={8,4,1,9,-3,6,5};
        for (int i = arr.length-1; i >0 ; i--) {
            int max=arr[i],maxdx=i;
            for (int j = i-1; j >=0 ; j--) {
                if(arr[j]>max){
                    max=arr[j];
                    maxdx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxdx];
            arr[maxdx]=temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
