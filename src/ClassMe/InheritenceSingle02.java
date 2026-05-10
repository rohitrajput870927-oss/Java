package ClassMe;

public class InheritenceSingle02 {
    static void main() {
        rohit g=new rohit();
        g.about();
        g.rohits();


    }
}
class galgotias{
    void about(){
        System.out.println("Galgotias University");
    }

}
class rohit extends galgotias{
    void rohits(){
        System.out.println("Rohit is a good boy");
    }
}
