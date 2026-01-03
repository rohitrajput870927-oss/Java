package Searching;

public class LastOccurence03 {
    static void main() {
        int[] arr={1,1,2,2,2,3,4,5,5,5,6,7,8,11};
        int n= arr.length;
        int lo=0,hi=n-1,indx=-1;
        int target=2;
        boolean found=false;
        while(lo<=hi){
            int mid=(lo+hi)/2;

            if(arr[mid]==target){
                indx=mid;
                lo=mid+1;//go right because we need last occurence
                found=true;
                System.out.println("Yes it is found"+arr[mid]);
                break;
            }
            else if (arr[mid]>target) {
                hi=mid-1;

            }
            else if (arr[mid]<target) {
                lo=mid+1;
            }
        }
        if(!found){
            System.out.println("Not Found");
        }

    }
}
