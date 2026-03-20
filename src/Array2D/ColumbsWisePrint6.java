package Array2D;

public class ColumbsWisePrint6 {
    static void main() {
        int [][] arr={{6,2,3,4},{3,2,1,1},{8,9,0,1}};
        for (int j = 0; j < arr[0].length; j++) {
            for(int i = 0; i <arr.length; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
    }
}
