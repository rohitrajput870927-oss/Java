package ArraysPrectice;

public class Prectice04 {
    static void main() {
        int[] arr={2,3,4,6,69,7};
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        print(arr);

    }
    static void print(int[] arr){
        arr[3]=444;
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
