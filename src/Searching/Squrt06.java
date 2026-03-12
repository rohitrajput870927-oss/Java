package Searching;

public class Squrt06 {
    static void main() {
        int n=20;
        int lo=1,hi=n;

        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(mid*mid==n){
                System.out.println(mid);
            }
            else if(mid*mid>n){
                hi=mid-1;
            }
            else if(mid*mid<n){
                lo=mid+1;
            }
        }
        System.out.println(hi);
    }
}
