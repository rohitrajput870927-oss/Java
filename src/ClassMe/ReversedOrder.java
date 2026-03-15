package ClassMe;

import java.sql.SQLOutput;

public class ReversedOrder {
    static void main() {
        int n=12345;
        while(n>0){
            int ld=n%10;
            n/=10;
            System.out.println(ld);

        }

    }
}
