package ClassMe;

public class IntroOfClass {

    static void main() {
         complex c=new complex();
         c.display();

    }

}

class complex {
    int a=9;
    int b=8;

    void display() {
        System.out.println("Complex No."+a+"+"+b+"i");
    }

}