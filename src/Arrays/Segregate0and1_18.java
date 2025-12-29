package Arrays;
//two pass Solution
public class Segregate0and1_18 {
    static void main() {
        int[] arr={1,1,0,1,0,0,1,1,0,0};
        int countZero=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == 0) {
                countZero++;
            }
        }
        for(int i=0;i<countZero;i++){
            arr[i]=0;
        }

        for(int i=countZero;i<arr.length;i++){
            arr[i]=1;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }




    }
}
