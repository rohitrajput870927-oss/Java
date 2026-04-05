package Array2D;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList10 {
    static void main() {
        ArrayList<Integer> a=new  ArrayList<>();
        a.add(3);a.add(4);a.add(0);
        ArrayList<Integer> b=new ArrayList<>();
        b.add(9);b.add(7);b.add(1);
        ArrayList<Integer> c=new ArrayList<>();
        c.add(1);c.add(5);c.add(13);
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        System.out.print(arr+" ");
        System.out.println();
        System.out.println(arr.get(0).get(2));
        arr.get(1).set(0,199);//update ke liye
        System.out.println(arr);
        arr.get(0).add(29);
        System.out.println(arr);

        arr.add(new ArrayList<>());
        System.out.println(arr);

        arr.get(arr.size()-1).add(90);arr.get(arr.size()-1).add(9);
        System.out.println(arr);





    }

}
