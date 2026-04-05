package Array2D;

public class prectice {
    static void main() {
        boolean isSort=true;


        int[] arr = {4, 5, 1, 2, 3};
        int n = arr.length-1;
        int x = 1;
        p(arr);

        print(0, x, arr);
        p(arr);

        print(x+1, n, arr);
        p(arr);

        print(0, n, arr);
        p(arr);
        if(true){
            System.out.println("yes");
        }
        else{
            System.out.println("false");
        }


    }
    public static void print(int i, int j, int[] a) {
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

    }
    public static void p(int[] ap){
        for (int i = 0; i < ap.length; i++) {
            System.out.print(ap[i]+" ");

        }
        System.out.println();
    }
}


