package BasicSort.Prectice;

public class Prectice01 {
    static void main() {
        int [] arr={3,5,1,4,2,0};
        boolean isSort=true;

        for(int i=0;i< arr.length-1;i++) {
            for(int k=0;k< arr.length-1;k++){
                if(arr[k]>arr[k+1]){
                    isSort=false;
                    break;
                }
            }
            if(isSort){
                break;
            }
            for (int j = arr.length - 1; j >0; j--) {

                if (arr[j] > arr[j - 1]) {
                    int tepm = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tepm;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
