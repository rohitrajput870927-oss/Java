package BasicSort.Prectice;

public class Prectice03 {
    static void main() {
        int[] arr={8,4,1,9,-3,6,5};
        for(int i=0;i<arr.length;i++){
            int min=arr[i],midx=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    midx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[midx];
            arr[midx]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

    }
}
