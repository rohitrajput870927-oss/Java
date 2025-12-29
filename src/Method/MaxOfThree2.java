package Method;
import java.util.Scanner;
public class MaxOfThree2 {
    static int ma(int a,int b,int c){
        if(a>b && a>c) return a;
        else if(b>a && b>c) return b;
        else return c;
    }
    static void main() {
        System.out.print(ma(2,6,8));

    }
}
