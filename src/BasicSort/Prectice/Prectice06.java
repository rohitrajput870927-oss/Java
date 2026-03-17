package BasicSort.Prectice;
import java.util.Arrays;
import java.lang.reflect.Array;;
public class Prectice06 {
    static void main() {
        int [] a={7,10,4,3,20,15};
        int k=3;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            int min=a[i],madx=i;
            for(int j=i+1;j<k;j++){
                if(a[j]<min){
                    a[j]=min;
                    madx=j;

                }
            }
            int temp=a[i];
            a[i]=a[madx];
            a[madx]=temp;

        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");

        }
        System.out.println();
        System.out.print(a[k-1]);
    }
}
