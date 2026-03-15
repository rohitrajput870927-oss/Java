package ArraysPrectice;
import java.util.ArrayList;
public class Prectice30 {
    static void main(String[] args) {
        ArrayList <Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(8);
        arr.add(10);
        System.out.print(arr);
        System.out.println(arr.get(2));
        System.out.println(arr.get(0));
        int n=arr.size();
        System.out.println(n);
        arr.set(2,5);
        System.out.println(arr);
        System.out.println(n);
        arr.add(2,18);
        arr.remove(3);




    }
}
