package BasicOfJava;
import java.lang.String;
import  java.util.Scanner;
public class prectice02 {
    static void main() {

        System.out.println("rohit");

        System.out.println("rohan");

        int a=4,b=8;
        System.out.println("The Sum of two Number."+a+b);

        String s="Rohit";
        String c="Rohan";
        System.out.println(s+"Rajput");
        System.out.println(c+"Singh");

        char f='y';
        char y='u';
        System.out.println(f);
        System.out.println(y);
        System.out.println(f+y);

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of x:");
        int x=sc.nextInt();
        System.out.println("Enter the value of k:");
        int k=sc.nextInt();
        System.out.println("Enter the value of t:");
        int t=sc.nextInt();

        System.out.println("Sum of Three No."+x+k+t);
        System.out.println("Multiple of three no."+x*y*t);
        System.out.println("Divition of two no."+x/y);

        System.out.println("Enter the name :");
        String r=sc.next();
        System.out.println("Enter the roll No.");
        String roll=sc.next();
        System.out.println("the roll And name"+r+" "+roll);

        int d=9;
        System.out.println(d++);
        System.out.println(d);
        System.out.println(++d);
        System.out.println(d);

        char e=(char)d;
        System.out.println(e);

        int g=(int)e;
        System.out.println(g);










    }
}
