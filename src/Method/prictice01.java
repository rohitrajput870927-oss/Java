package Method;

public class prictice01 {
    static int  hello(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("a is greater");

        }
        else if(b>a && b>c){
            System.out.println("b is greater then both");
        }
        else{
            System.out.println("c is greater then both");
        }
        return 3;
    }
    static void main() {
        System.out.println("Hello everybody I am Rohit kumar singh");
        System.out.print(hello(4,5,7));

    }
}
