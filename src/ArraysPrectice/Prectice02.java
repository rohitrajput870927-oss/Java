package ArraysPrectice;

public class Prectice02 {
    static void main() {
        int[] arr={9,4,8,2,7,1,9};
        int sum=0;
        int pro=1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            pro=pro*arr[i];
        }
        System.out.print(sum);
        System.out.print("\n");
        System.out.print(pro);
    }
}
