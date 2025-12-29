package Arrays;

public class Sum2_12 {
    static void main() {
        int[] arr={1,2,4,5,6,7};
        int n=arr.length;
        int target=13;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                }

            }
        }
    }
}
