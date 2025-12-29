package Loop.WhileLoop;
import java.util.Scanner;
public class MutlipleTable6 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int row=1;

        do {
            int col = 1;
            do {
                int y = row * col;//row 1 hai col change hote rahega n tak phir isake baat row 2 hoga col fixed rahega 1 to n
                System.out.println(" "+y);
                col++;
            }
            while (col <= n);
            System.out.println("\n");
            row++;
        }
        while(row<=n);



    }
}
