package ArraysPrectice;

import java.util.ArrayList;
import java.util.Scanner;


public class Prectice32 {
    static void main() {

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(9);
        arr.add(9);
        arr.add(9);
        arr.add(9);
        arr.add(9);
        arr.add(9);
        System.out.println("Print arr"+arr);
        int cary=1;
        for(int i=arr.size()-1;i>=0;i--){
            if(arr.get(i)+cary<=9){
                arr.set(i,arr.get(i)+cary);
                cary=0;
                break;

            }
            else if(arr.get(i)+cary==10){
                arr.set(i,0);
                cary=1;
            }
        }
        if(cary==1){
            arr.add(0,1);
        }
        else{
            System.out.println("no");
        }
        System.out.print(arr);


    }
}
