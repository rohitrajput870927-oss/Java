package Arrays;
import java.util.Arrays;
public class ShortArray9 {
    static void main() {
        //sort-ascending order
        int[] arr={3,6,-2,7,9};
        prints(arr);
        Arrays.sort(arr);
        prints(arr);



    }
    static void prints(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
    }
}
