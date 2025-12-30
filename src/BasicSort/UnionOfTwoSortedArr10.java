package BasicSort;

public class UnionOfTwoSortedArr10 {
    static void main() {
        int[] a={1,3,5,7};
        int[] b={0,2,3,7,8,10};
        int[] c=new int[a.length+ b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                c[k]=a[i];
                i++;
                j++;
                k++;
            }
            else if (a[i]<b[j]) {
                c[k]=a[i];
                i++;
                k++;

            }

            else if (a[i]>b[j]) {
                c[k]=b[j];
                j++;
                k++;

            }
        }
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }

        while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }
        for (int l = 0; l < k; l++) {
            System.out.print(c[l]+" ");

        }
    }
}
