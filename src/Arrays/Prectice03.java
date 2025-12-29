package Arrays;

public class Prectice03 {
    static void main() {
        int[] arr={4,6,8,0,1,4,3,5,35};
        int start=0,end= arr.length-1;
        while(start < end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.print("The arr is after reversed");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
