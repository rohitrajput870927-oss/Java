package Arrays;

public class PassByValueAraay7 {
    static void main() {
        int[] x={1,32,56,34,21};
        System.out.print(x[2]);
        change(x);
        System.out.print(x[2]);



    }
    static void change(int[] y){//yaha pe y and x upar wala dono same hai
        System.out.print("Rohit");
        y[2]=388;



    }
}

