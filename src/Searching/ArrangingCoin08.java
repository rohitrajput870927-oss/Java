package Searching;

public class ArrangingCoin08 {

    public static int r(int n){ //return karne ke liye  kayoki main functiom me return nahi ho sakta hai na
        int m = n;
        return (sqrt(8 * m + 1)-1)/2;
    }

    public static int sqrt(int n){//Squrt root ke liye ye function banaya gaya hai
        int lo=1,hi=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid>n){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return hi;
    }


    public static void main(String[] args) {
        System.out.println(r(10));
    }

}

