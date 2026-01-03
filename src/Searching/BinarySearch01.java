package Searching;

public class BinarySearch01 {
    static void main() {
        int[] arr={-76,-4,9,28,47,49,510,615,991,9999};
        int target=-4;
        int n= arr.length;
        int lo=0,hig=n-1;
        boolean found=false;
        while(lo<=hig){

            int mid=(lo+hig)/2;//sare element ko mid se compare karege isiliye ham ise hi use karte hai

            if(arr[mid]>target){
                hig=mid-1;
            }

            else if(arr[mid]<target){
                lo=mid+1;
            }

            else if(arr[mid]==target){
                System.out.println("Element Found "+arr[mid]);
              found=true;
              break;
            }

        }

        if(!found){
            System.out.println("not");
        }

    }
}
