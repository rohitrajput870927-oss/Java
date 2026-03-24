package Array2D;

public class Transpose9 {
    static void main() {
        int [][] a={{2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2}};
        print(a);
        System.out.println();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<i;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        print(a);


    }
    static void print(int[][] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
