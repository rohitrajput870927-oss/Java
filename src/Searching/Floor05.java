package Searching;

public class Floor05 {
    static void main() {
        int[] arr={1,2,4,8,10,10,12,19};
        int n=arr.length;
        int lo=0,hi=n-1,indx=-1;
        int target=3;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>target){
                hi=mid-1;//left me aa jayega
            }
            else if(arr[mid]<=target){
                indx=mid;
                lo=mid+1;

            }

        }
        System.out.println(indx);
    }
}
