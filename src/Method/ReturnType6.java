package Method;

public class ReturnType6 {
    static int rohit(){
        System.out.println("Rohan");
        return 4;//jab bhi int lagega to return hoga hi
        //return pe aaya to matlab code khatam hai
    }
    static void main() {
        rohit();//ye sirf Rohan print karega
        System.out.println(rohit());//ye value ko bhi print karega

    }
}
