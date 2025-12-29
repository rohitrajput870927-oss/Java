package IF_ELSE;
import java.util.Scanner;
public class areaOfRectangle15 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Length");
        int l=sc.nextInt();
        System.out.print("Enter the width");
        int w=sc.nextInt();
        int area=l*w;
        int pm=2*(l+w);//perimeter of Rectangle
        if(area>pm){
            System.out.print("Area is greater then the perimeter");

        }
        else{
            System.out.print("Perimeter is greater then Area");
        }
    }
}
