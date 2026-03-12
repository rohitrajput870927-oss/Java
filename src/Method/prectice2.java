package Method;

public class prectice2 {

        static void main() {
            h();


        }
        static void rohit(){
            System.out.println("Rohit is a good boy ");

        }
        static void rohan(){
            System.out.println("Rohan is a good boy2");
            rohit();
        }
        static void h(){
            System.out.println("hello every body");
            rohan();
        }
    }

