package BasicOfJava;

public class CharDatatype15 {
    static void main() {
        //Char ka use sirf ek letter print karwane ke liye kiya jata hia
        char rohit='r';
        System.out.println(rohit);
        //char rohan='rohit hdp' NOT Valied
        char ro='#';
        System.out.println(ro);

        char toe='4';
        System.out.println(toe);

//TypeCasting is use to convert one dataType to Another Datatype
        System.out.println("ASCII Value by typecasting");
        char ch='A';
        int r=ch;//implicit typecasting
        System.out.println(r);

        char d='p';
        System.out.println((int)d);//explicit typecasting


        char u='u';
        System.out.println((int)u);

        char t='g';
        System.out.println(t+0);//char+int->number

        //For integer
        int x=90;
        char v=(char)x;
        System.out.println(v);






    }
}
