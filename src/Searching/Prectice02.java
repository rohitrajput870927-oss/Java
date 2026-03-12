package Searching;

public class Prectice02 {
    static void main() {
        int[] arr={1,3,4,6,7,9,10,4,6,7,8,9};
        int n=arr.length;
        boolean found=false;
        int lo=1,hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                System.out.println("Yes"+arr[mid]);
                found=true;
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        if(!found){
            System.out.println("No pick");
        }
    }
}
