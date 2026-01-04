package Searching;

public class LastOccurence03 {
    static void main() {
        int[] arr = {1,1,2,2,2,3,4,5,5,5,6,7,8,11,78};
        int n = arr.length;
        int lo = 0, hi = n - 1, indx = -1;
        int target = 2;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] == target) {
                indx = mid;      // store index
                lo = mid + 1;    // move right
            }
            else if (arr[mid] > target) {
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }

        if (indx != -1) {
            System.out.println("Last occurrence found at index: " + indx);
        } else {
            System.out.println("Not Found");
        }
    }
}
