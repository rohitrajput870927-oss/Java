package ArraysPrectice;
import java.util.Scanner;
public class Prectice27 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        int sum=0;
        int [] arr=new int[n-1];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("\n");
        System.out.println("the element is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            }
        System.out.println(sum+"\n");
        int sum2=(n*(n+1))/2;
        System.out.println(sum2);
        System.out.println("Missingh element");
        System.out.println(sum2-sum);

        }

    }

