package Arrays;

public class Rotate17 {
    static void main() {
        int[] arr={8,3,4,2,9,0,7};
        System.out.print("Original arr:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.print("\n");
        System.out.print("After first reversed:");
        revers(arr,0,2);

        System.out.print("\n");
        System.out.print("After second reversed:");
        revers(arr,3,arr.length-1);

        System.out.print("\n");
        System.out.print("After final reversed:");
        revers(arr,0,arr.length-1);


    }
    static void revers(int[] arr,int n,int m){
        while(n<m){
               int temp=arr[n];
               arr[n]=arr[m];
               arr[m]=temp;
               n++;
               m--;
            }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
