package BasicSort;

public class ReversedBubbleSort8 {
    static void main() {
        int[] arr={8,4,1,9,-3,6,5};
        for (int i = 0; i < arr.length; i++) {
            boolean isSort=true;
            for (int p = arr.length-1; p >0; p--) {//condition check kiye ki kahi ye pahale hi short to nahi ho gaya hai na
                if(arr[p]<arr[p-1]){
                    isSort=false;
                    break;
                    
                }
            }
            if (isSort) {
                break;
            }
            for(int j= arr.length-1;j>0;j--){//reversed ke liye kiye log isako ham sidha bhi chala dete to sahi hai rahata
                if(arr[j]>arr[j-1]){//agar j greater then j-1 hai to swap hoga
                    //j last element hai j-1 usase last-1 element hai  ab agar last wala bada hai to usako usake age wale se swap kar do
                    //taki awswer decending order me aa sake
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
