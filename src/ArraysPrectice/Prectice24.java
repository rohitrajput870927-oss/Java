package ArraysPrectice;

public class Prectice24 {
    static void main() {
        int[] arr={7,2,5,1,3,2};
        int max=arr[0];
        int max2=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max2){
            if(arr[i]==max){
                continue;
            }
            else{
               max2=arr[i];
            }
            }
        }
        System.out.println(max2);
    }
}
