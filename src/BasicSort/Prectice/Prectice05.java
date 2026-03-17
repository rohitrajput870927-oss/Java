package BasicSort.Prectice;
import java.lang.Math;
public class Prectice05 {
    static void main() {
        int[] a={1,1,1,2,3,4,5,5};
        int [] b={1,1,2,4,4,6,8};
        int[] c=new int[Math.min(a.length,b.length)];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                c[k]=a[i];
                i++;
                j++;
                k++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
        }
        for(int p = 0; p <k; p++){
            System.out.print(c[p]+" ");
        }

    }
}
