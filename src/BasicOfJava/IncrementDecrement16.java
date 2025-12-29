package BasicOfJava;

public class IncrementDecrement16 {
    static void main() {
        int x=2;
        System.out.println(x);
        x+=10;
        System.out.println(x);
        //Post increment means pahale use karo fir badhao
        System.out.println(x++);

        System.out.println(x);

        //pre increment me pahale badhao phir use karo
        System.out.println(++x);
        System.out.println(x);

        System.out.println("Decrement");
        //Post decrement
        System.out.println(x--);
        System.out.println(x);
        //Pre Decrement
        System.out.println(--x);
        System.out.println(x);

        int a=10;
        int b=a++;//Pahale a=10 hoga phir badhega
        System.out.println(a+" "+b);



    }
}
