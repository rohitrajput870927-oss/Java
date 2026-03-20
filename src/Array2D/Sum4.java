package Array2D;
import java.util.Scanner;
public class Sum4 {
    static void main() {
        int [][] arr=new int[3][3];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Element");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("the arr is");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of all element");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println(sum);


    }
}
