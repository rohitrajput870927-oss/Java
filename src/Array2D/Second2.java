package Array2D;

public class Second2 {
    static void main() {
        int [][] arr={{6,3,2,1},{2,3,8,90},{83,0,1,4},{3,7,8,0}};
        int a= arr.length,b=arr[0].length;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
