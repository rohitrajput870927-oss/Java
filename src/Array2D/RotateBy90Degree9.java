package Array2D;

public class RotateBy90Degree9 {
    static void main() {
        int[][] arr={{2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2}};
        print(arr);
        System.out.println();
        System.out.println("After transpose the arr:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        print(arr);
        System.out.println("When we do reversed of all row then output will print" +
                "");
        for (int i = 0; i <arr.length ; i++) {
            int start=0,end=arr[0].length-1;
            while(start<end){
                int temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++;
                end--;
            }

        }
        print(arr);
    }
    static void print(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();

        }
    }
}
