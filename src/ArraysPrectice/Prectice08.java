package ArraysPrectice;

public class Prectice08 {
    static void main() {
        int [] arr={7,1,9,0,5,2,4};
        int n=arr.length;
        int  target=6;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("yes element is present in arr:"+arr[i]+" "+arr[j]);

                }
            }
        }
    }
}
