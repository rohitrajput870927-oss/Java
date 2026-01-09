package Searching;

public class SearchInSortedAndRotetedArr10 {
    static void main() {
        int[] arr={5,6,7,8,9,10,1,2,3};
        int n=arr.length;
        int target=3;
        int lo=0,hi=n-1,indx=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target) {
                indx=mid;
                System.out.println(indx);
                break;

            }
            else if(arr[lo]<arr[mid]){
                if(arr[lo]<=target && target<arr[mid]){

                    hi=mid-1;

                }
                else{
                    lo=mid+1;
                }
            }
            else if (arr[mid]<arr[hi]) {
                if(arr[mid]<target && target<=arr[hi]){

                    lo=mid+1;

                }
                else{
                    hi=mid-1;
                }

            }
        }

    }
}
