package ArraysPrectice;

public class Prectice13 {
    static void main() {
        int[] a = {2, 3, 5, 6, 8, 9};
        int[] b = {1, 4, 7, 10, 11, 12, 13, 14};
        int[] c=new int[a.length+b.length];
        int i = 0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                c[k]=b[j];
                j++;
                k++;
            }
            else{
                c[k]=a[i];
                i++;
                k++;
            }

        }
        //if i==a.length
        while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }
        while (i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }
        for (int l = 0; l < c.length; l++) {
            System.out.print(c[l]+" ");

        }
    }
}
