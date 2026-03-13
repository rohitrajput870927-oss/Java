package ArraysPrectice;

public class Prectice20 {
    static void main() {
        int [] arr1={2,4,5,6,7,8,9};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[3]);
        System.out.println("The arr after function is called:");
        change(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[3]);

    }
    static void change(int[] arr){
        arr[0]=3;
        arr[3]=432;
        arr[1]=34124;
    }
}
