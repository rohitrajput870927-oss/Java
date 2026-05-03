package ClassMe;
import java.lang.String;
public class Prectice02 {
    String Name;
    int roll;
    int age;
    char cla;
    Prectice02(String n,int r,int a,char c){
        Name=n;
        roll=r;
        age=a;
        cla=c;
        System.out.println("jrojfhohd");

    }
    void display(){
        System.out.println("Hello every one ");

    }

    static void main() {
        Prectice02 p=new Prectice02("Rohit",4,24,'r');
        p.display();
        System.out.println(p.Name);
        System.out.println(p.cla);
        System.out.println(p.age);
        System.out.println();

    }
}
