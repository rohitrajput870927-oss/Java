package ArraysPrectice;
import java.util.Scanner;
public class prectice19 {
    static void main() {
        int[] arr={3,7,9,0,1,4,6};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
