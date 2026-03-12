package BasicOfJava;
import java.io.Console;

public class calsss2 {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int result = a * b;

        Console con = System.console();

        if (con != null) {
            con.printf("%d", result);
        } else {
            System.out.println(result);
        }
    }
}




