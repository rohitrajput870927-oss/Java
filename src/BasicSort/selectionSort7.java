package BasicSort;

public class selectionSort7 {
    static void main() {
        int[] arr={4,6,2,1,8,13,0};
        for (int i = 0; i < arr.length; i++) {
            int min=arr[i],mindx=i;
            for (int j = i+1; j < arr.length; j++) {//i+1 ke ba wale sare element ko check karege
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        for (int p = 0; p < arr.length; p++) {
            System.out.print(arr[p]+" ");

        }
    }
}
