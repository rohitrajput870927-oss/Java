package Method;

public class Fect {
    static void main() {
        Fact(5);
    }

    static int Fact(int n) {
        int fcat = 1;
        for (int i = 1; i <= n; i++) {
            fcat = fcat * i;
        }
        System.out.println(fcat);
        return 0;
    }

}

