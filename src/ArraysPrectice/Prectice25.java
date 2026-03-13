package ArraysPrectice;

public class Prectice25 {
    static void main() {
        int[] arr={7,2,5,1,3,2};
        int i=0;
        int j=arr.length-1;
        print(arr);
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println("\n");
        print(arr);

    }
    static void print(int [] y){
        for(int i=0;i<y.length;i++){
            System.out.print(y[i]+" ");
        }
    }
}
