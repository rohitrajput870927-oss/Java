package ArraysPrectice;

public class Prectice06 {
    static void main() {
        int[] arr={9,4,5,6,8,83};
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                System.out.print(arr[i]+10+" ");
            }
            else{
                System.out.print(2*arr[i]+" ");
            }
            }

        }
    }

