package Searching;

public class maxPositiveAndNegative09 {
    static void main() {
        int[] arr={-8,-6,-7-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7};
        int n=arr.length;
        int lo=0,hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]<=0){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        int firstPositive=n-lo;

        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>0){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        int negative=lo;
        System.out.println(Math.max(firstPositive,negative));
    }
}
