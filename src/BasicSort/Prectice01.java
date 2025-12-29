package BasicSort;

public class Prectice01 {
    static void main() {
        int[] a={3,1,2,5,6,7,8};
        for(int k=0;k<a.length;k++) {
            boolean isSort=true;
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    isSort=false;
                    break;

                }
            }
            if (isSort ) {
                break;

            }

            for (int i = 0; i < a.length - 1-k; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;

                }

            }

        }
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }
    }
}
