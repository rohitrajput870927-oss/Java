package Arrays;
import java.util.Arrays;
public class ShallowCopyDeepCopy8 {
    static void main() {
        int [] arr={1,4,6,7};
        int[] x=arr;
        x[3]=888;//this is shallowCopy which is
        System.out.println(arr[3]);//

        int[] y=Arrays.copyOf(arr,arr.length);//deep copy isame value change nahi hota hai
        y[0]=10;//copyOf(jis arr ko copy karna hai,kaha tak karna hai)
        System.out.println(y[0]);
        System.out.print(arr[0]);//is arr ko copy kiye the log lekin koi change nahi aaya
    }
}
