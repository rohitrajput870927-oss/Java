package Arrays;

public class Rotate16 {
    static void main() {
        int[] arr={6,8,1,2,4,9,0};
        int start=0,j=1,k=2,end=arr.length-1;
        while(start<j){
            int temp=arr[start];
            arr[start]=arr[j];
            arr[j]=temp;
            start++;
            j--;
        }
        for(int o=0;o<arr.length;o++){
            System.out.print(arr[o]+" ");
        }
        System.out.print("\n");
        while(k<end){
            int tem=arr[k];
            arr[k]=arr[end];
            arr[end]=tem;
            k++;
            end--;
        }
        for(int o=0;o<arr.length;o++){
            System.out.print(arr[o]+" ");
        }
        System.out.print("\n");
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.print("Reversed Array: ");
        for (int p=0;p<arr.length;p++) {
            System.out.print(arr[p] + " ");
        }
    }
}
