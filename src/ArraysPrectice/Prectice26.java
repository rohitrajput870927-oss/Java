package ArraysPrectice;

public class Prectice26 {
    static void main() {
        int [] arr={7,2,5,1,3,2};
        int i=0;
        int j= arr.length-1;
        int d=2;
        print(arr);
        System.out.println("Af");
        rev(arr,i,d);
        print(arr);
        System.out.println("af2");
        rev(arr,d+1,j);
        print(arr);
        System.out.println("Final");
        rev(arr,i,j);
        print(arr);

    }
    static void rev(int [] y,int a,int b){
        while(a<=b){
            int temp=y[a];
            y[a]=y[b];
            y[b]=temp;
            a++;
            b--;
        }
    }
    static void print(int[] t){
        for(int i=0;i<t.length;i++){
            System.out.print(t[i]+" ");
        }
        System.out.println("\n");
    }
}
