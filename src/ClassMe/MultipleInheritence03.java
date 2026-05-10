package ClassMe;

public class MultipleInheritence03 {
    static void main() {
        demo d = new demo();
        d.show();
        d.showa();

    }
}
interface a{
    void show();
}

interface b{
    void showa();
}

class demo implements a,b{
    public void show(){
        System.out.println("Rohit Kumar Singh");
    }


    public void showa() {
        System.out.println("He is from bihar");

    }

}