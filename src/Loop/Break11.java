package Loop;

public class Break11 {
//    The break statement can also be used to jump out of a loop.
static void main() {
    for (int i = 0; i < 10; i++) {
        if (i == 4) {// 4 ke bad wala print nahi hoga
            break;
        }
        System.out.println(i);
    }
}
}
