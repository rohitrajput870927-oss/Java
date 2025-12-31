package BasicSort;

import java.util.Arrays;

public class X {
    static void main() {
        int[] arr={3,4,5,1,2};
        int[] c=new int[arr.length];
        System.out.print("Original arr:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        Arrays.sort(arr);
        System.out.print("After sort arr:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


        System.out.print("\n");
        System.out.print("After first reversed:");
        revers(arr,0,1);

        System.out.print("\n");
        System.out.print("After second reversed:");
        revers(arr,2,arr.length-1);

        System.out.print("\n");
        System.out.print("After final reversed:");
        revers(arr,0,arr.length-1);

        for (int i = 0; i < c.length; i++) {
            c[i]=arr[i];
            i++;

            System.out.print(arr[i]+" ");
        }


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
