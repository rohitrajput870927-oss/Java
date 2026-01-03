package Searching;

public class FirstOccurence02 {
    static void main() {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 11};
        int n = arr.length;
        int lo = 0, hi = n - 1, indx = -1;
        int target = 5;
        boolean found = false;
        while (lo <= hi) {
            int mid=(lo+hi)/2;


            if (arr[mid]==target){
                indx=mid;
                hi=mid-1;//go left first occurence chahiye tha na isileye
                System.out.println("Yes the firt occurence"+arr[mid]);
                found=true;
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
            System.out.println("Not Avail");
        }

    }

}
