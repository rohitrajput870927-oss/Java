package Array2D;
import java.util.Scanner;
public class Input3 {
    static void main() {
        int [][] arr=new int[3][4];
        Scanner sc=new Scanner(System.in);
        System.out.print("For input");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.print("Print the Arrays");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
