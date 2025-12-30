package BasicSort;
public class BubbleSort1 {
    static void main() {
        int[] arr={8,4,1,9,-3,6,5};
//        for (int i = 0; i < arr.length-1; i++) {
//            //ye ek round hoga or fir aaise hi ye i < arr.length-1 yaha tak chalega
//
//         for (int j = 0; j < arr.length - 1-i; j++) {//swap hoga na isiliye  arr.length-1 kiya gaya hai taki i+1 me koi error na aaye
//            if (arr[j] > arr[j + 1]) {//j < arr.length - 1-i me -i isaliye kiya gaya hai kayoki har ek round ke bad last se element sort hote rahate hai
//                int temp = arr[j];
//                arr[j] = arr[j + 1];
//                arr[j + 1] = temp;
//            }
//        }
//
//
//
//         }
//        }
//        print(arr);
//    }




        //Optimised version
//        for (int i = 0; i < arr.length - 1; i++) {
//            boolean isSorted = true;
//            for (int k = 0; k < arr.length - 1; k++) {
//                if (arr[k] > arr[k + 1]) {//check kerega har ke round ke bad ki kahi arr sort to nahi ho gaya hai
//                    isSorted = false;
//                    break;//agar false ho gaya to ye break ho jayega bas k wala loop
//                }
//            }
//            // agar ham log ye nahi lagate to agar loop pahale hi sort hogaya hota phir bhi loop pura chalega last tak
//            if (isSorted) {
//                break;//or agar sort ho gaya hia to agle round me nahi jayega pura loop hi break ho jayega
//            }
//
//            for (int j = 0; j < arr.length - 1 - i; j++) {//swap hoga na isiliye  arr.length-1 kiya gaya hai taki i+1 me koi error na aaye
//                if (arr[j] > arr[j + 1]) {//j < arr.length - 1-i me -i isaliye kiya gaya hai kayoki har ek round ke bad last se element sort hote rahate hai
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//
//
//        }
//
//        print(arr);
//    }


//agar pahale se hi sort hai to usame achha work karega
        for (int i = 0; i < arr.length - 1; i++) {
            int swap=0;
            for (int j = 0; j < arr.length - 1 - i; j++) {//swap hoga na isiliye  arr.length-1 kiya gaya hai taki i+1 me koi error na aaye
                if (arr[j] > arr[j + 1]) {//j < arr.length - 1-i me -i isaliye kiya gaya hai kayoki har ek round ke bad last se element sort hote rahate hai
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if(swap==0){
                break;//matlab pahale se hi sort hai ye isiliye nomber of swap =0 hai
            }
        }

        print(arr);
    }

    static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }

    }
}


