package Arrays;

public class prectice36 {
    static void main() {
        int[] arr={5,2,1,4};
        int sum=0;
        int a=arr.length+1;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        int sumi=(a*(a+1))/2;
        System.out.println(sum-sumi);
    }

}
