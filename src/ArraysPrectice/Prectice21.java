package ArraysPrectice;

import java.util.Arrays;

public class Prectice21 {
    static void main() {
       int[] arr={1,2,3,4,5,6,7};
       for(int i=0;i<arr.length;i++){
           if(i%2==0){
               System.out.print(arr[i]+10+" ");
           }
           else{
               System.out.print(arr[i]+1+" ");
           }
       }

    }
}
