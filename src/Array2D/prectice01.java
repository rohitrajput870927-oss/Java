package Array2D;

public class prectice01 {
    static void main() {
        int[] arr={1,2,3,9,4,9};
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<= i;j++){
                System.out.print(" "+" ");
            }


            for(int j=i;j< arr.length;j++){
                System.out.print(arr+" ");
            }
            System.out.print("\n");
        }
    }
}
