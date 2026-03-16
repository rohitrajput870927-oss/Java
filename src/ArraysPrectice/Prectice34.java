package ArraysPrectice;

public class Prectice34 {
    static void main() {
        int[] p = {2, 5, 6, 9};
        int[] t = {1, 3, 4, 5, 10, 11};
        int[] c = new int[p.length + t.length];
        System.out.println("Befor sort"+" ");
        for(int ele:c){
            System.out.print(ele);
        }
        System.out.println("\n");
        System.out.println("After sort");
        marge(p,t,c);
        for(int ele:c){
            System.out.print(ele+" ");
        }

    }

    static void marge(int [] a,int [] b,int [] k){
            int i = 0, j = 0, p = 0;
            while (i < a.length && j < b.length) {
                if (a[i] > b[j]) {
                    k[p] = b[j];
                    j++;
                    p++;

                } else if (a[i] < b[j]) {
                    k[p] = a[i];
                    i++;
                    p++;
                }
            }
            while (j < b.length) {
                k[p] = b[j];
                j++;
                p++;
            }
            while (i < a.length) {
                k[p] = a[i];
                i++;
                p++;
            }


        }


}
