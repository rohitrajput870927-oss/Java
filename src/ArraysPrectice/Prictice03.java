package ArraysPrectice;

public class Prictice03 {
    static void main() {
        int[] arr={8,9,2,4,5,2,10};
        int n=arr.length;
        int max=arr[0];
        int max2=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(max);
        System.out.print("\n");
        for(int i=0;i<n;i++){
            if(arr[i]>max2){
                if(arr[i]!=max){
                    max2=arr[i];
                }
            }
        }
        System.out.print(max2);
    }
}
