package Array2D;

public class First1 {
    static void main() {
        int [][] arr=new int[3][4];
        int a=arr.length,b=arr[0].length;
        System.out.print("Length of row"+a+" "+"Length of columbs"+b);
        System.out.println();
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}
