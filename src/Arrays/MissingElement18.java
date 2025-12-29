package Arrays;

public class MissingElement18 {
    static void main() {
        int[] arr={8,2,4,5,3,7,1};
        int n=arr.length+1;//because hame element 1 to n tak chahiye jo arr me miss hai
        int sum=(n*(n+1))/2;//sum from 1 to n
        int arrsum=0;
        System.out.print("Array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("Sum of Array is:");
        for(int i=0;i<arr.length;i++){
            arrsum+=arr[i];

        }
        System.out.println(arrsum);
        System.out.print("Missing Element");
        System.out.print(sum-arrsum);



    }
}
