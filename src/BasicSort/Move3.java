package BasicSort;

public class Move3 {
    static void main() {
        int[] arr={1,0,-2,3,0,4,8,0,10,12};
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }


        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
