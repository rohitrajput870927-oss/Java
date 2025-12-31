package BasicSort;

public class Prectice02 {
    static void main() {
        int[] a={3,1,5,7,0};
        int k=3;
        for (int i = 0; i < k; i++) {
            int min=a[i],mindx=i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]<min){
                    min=a[j];
                    mindx=j;
                }

            }
            int temp=a[i];
            a[i]=a[mindx];
            a[mindx]=temp;

        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");

        }
        System.out.println("\n");
        System.out.println(a[k-1]);
    }
}
