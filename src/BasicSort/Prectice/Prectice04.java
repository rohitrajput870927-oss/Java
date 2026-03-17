package BasicSort.Prectice;

public class Prectice04 {
    static void main() {
        int [] arr={8,4,1,9,-3,6,5};
        for(int i=arr.length-1;i>=0;i--){
            int max=arr[i],madx=i;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>max){
                    max=arr[j];
                    madx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[madx];
            arr[madx]=temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
