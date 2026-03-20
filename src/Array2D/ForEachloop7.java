package Array2D;

public class ForEachloop7 {
    static void main() {
        int[][] arr={{1,4,1,5,3},{1,5,3,4},{0,5,4,1}};
        for(int i=0;i< arr.length;i++){
            for(int ele:arr[i]){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
