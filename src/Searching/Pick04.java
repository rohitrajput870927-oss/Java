package Searching;

public class Pick04 {
    static void main() {
        int[] arr={-1,0,1,2,5,6,8,6,3};
        int lo=1,hi= arr.length-1;
        boolean found=false;

        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){//6 8 6
                System.out.println(mid);
                found=true;
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){//2 5 6
                lo=mid+1;
            }
            else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]){//9 6 5
                hi=mid-1;
            }
        }
        if(!found){
            System.out.println("Not present ");
        }

    }
}
