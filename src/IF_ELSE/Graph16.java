package IF_ELSE;
import java.util.Scanner;
public class Graph16 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the x: ");
        int x=sc.nextInt();
        System.out.print("Enter the y: ");
        int y=sc.nextInt();
        if(x>0 && y>0){
            System.out.print("1st Que");

        }
        else if(x<0 && y>0){
            System.out.print("2nd Que");

        }
        else if(x>0 && y<0){
            System.out.print("3rd Que");
        }
        else{
            System.out.print("4th Que");
        }
    }
}
