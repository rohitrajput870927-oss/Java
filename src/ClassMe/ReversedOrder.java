package ClassMe;

import java.sql.SQLOutput;

public class ReversedOrder {
    static void main() {
        int n=12345;
        int sum=0;
        while(n>0){
            int ld=n%10;
            n/=10;
            System.out.print(ld);
            sum=sum+ld;

        }
        System.out.println();
        System.out.print(sum);

    }
}
