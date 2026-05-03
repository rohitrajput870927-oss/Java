package ClassMe;

class maths {
    void add(int a, int b) {
        System.out.println("Sum of two integer Number is:");
        System.out.println(a + b);
    }

    void add(int a, float b) {
        System.out.println("Minus of int and float Number is:");
        System.out.println(a - b);
    }

    void add(float a, float b) {
        System.out.println("Multiply of two float Number is:");
        System.out.println(a * b);
    }
}

public class MathodOverLoad {
    public static void main(String[] args) {
        maths m = new maths();

        m.add(2, 5);
        m.add(7, 8.9f);
        m.add(8.6f, 7.9f);
    }
}