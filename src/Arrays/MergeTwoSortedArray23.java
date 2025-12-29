package Arrays;

public class MergeTwoSortedArray23 {
    static void main() {
        int[] a = {2, 3, 5, 6, 8, 9};
        int[] b = {1, 4, 7, 10, 11, 12, 13, 14};
        int[] c=new int[a.length+b.length];
        System.out.println("Befor sort"+" ");
        for(int ele:c){
            System.out.print(ele);
        }
        System.out.println("\n");
        System.out.println("After sort");
        merged(c,a,b);
        for(int ele:c){
            System.out.print(ele+" ");
        }


    }
    static void merged(int[] c,int[] a,int[] b ){
        int k=0,i=0,j=0;//i for a, j for b ,k for c arrays
        while(i<a.length && j<b.length) {
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else {//a[i]>a[j]
                c[k] = b[j];
                j++;
                k++;

            }
        }

//        if (i == a.length - 1) {//arr a pura khatam ho gaya hai matalab usake sare element print ho gaye hai jo aab jo b arr ke element bache hai wo deract hi print ho jayega ko compresion nahi hoga
        while(j<b.length) {
                c[k] = b[j];
                j++;
                k++;
            }
//            if(j==b.length)
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }

            }

        }


