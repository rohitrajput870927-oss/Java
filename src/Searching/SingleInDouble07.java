package Searching;

public class SingleInDouble07 {
    static void main() {
        int[] arr={1,1,2,2,3,3,4,5,5,6,6};
        int n=arr.length;
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                System.out.println(arr[mid]);
            }

            int f=mid,s=mid;
            if(arr[mid-1]==arr[mid]){
                f=mid-1;
            }
            else if(arr[mid]==arr[mid+1]){
                s=mid+1;
            }
            int leftCount=f-lo;
            int rightCount=hi-s;
            if(leftCount%2==0){// leftcount  even hua to odd  right me move karege
                lo=mid+1;
            }
            else if (leftCount%2!=0) {
                hi=mid-1;

            }
        }
    }
}
