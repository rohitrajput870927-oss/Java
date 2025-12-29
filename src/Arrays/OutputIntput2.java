package Arrays;
import java.util.Scanner;
public class OutputIntput2 {
    static void main() {
        Scanner sc=new Scanner(System.in);
//        int[] arr={3,5,7,4,0,20,26};
////        System.out.println(arr.length);//for length
//        int l=arr.length;
//        for(int i=0;i<=l;i++){
//            System.out.print(arr[i]+" ");
//        }

//        int[] r=new int[7];
//        int n=r.length;
//        //default value
//        for(int j=1;j<n;j++){
//            System.out.print(r[j]+" ");
//        }

        //input
        int[] arr=new int[3];
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
