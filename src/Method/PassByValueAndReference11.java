package Method;

public class PassByValueAndReference11 {
    static void main() {
        int a=2;//isaka address agal hai
        System.out.println("Befor"+a);
        m(a);
        System.out.println("After"+a);


    }
    static int m(int a) {
        a = a * 100;//or isaka address alag hai
        return a;
    }
}
