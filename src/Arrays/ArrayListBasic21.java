package Arrays;

import java.util.ArrayList;
import java.util.Collections; // Changed from Collection to Collections

public class ArrayListBasic21 {
    // main method should be 'public static void main(String[] args)'
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // adding element in arr
        arr.add(98);
        arr.add(1);
        arr.add(9);
        arr.add(8);

        // print the element
        System.out.println(arr.get(2));
        System.out.println(arr.get(0));

        // update the element
        arr.set(2, 1000);
        System.out.println(arr.get(2));

        // length
        int n = arr.size();
        System.out.println(n);

        // arr without tranvers
        System.out.print(arr);
        System.out.print("\n");

        // the arr
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.print("\n");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.print("\n");

        // for add in present
        arr.add(2, 56);
        System.out.print(arr); // 56 2 pe ho jayega or baki element age chale jayege

        // remove element
        System.out.print("\n");
        arr.remove(0);
        System.out.print(arr);

        // reversed
        System.out.print("\n");
        Collections.reverse(arr); // Corrected to use Collections class
        System.out.print(arr);

        System.out.print("\n");
        //apna wala code
        int k=0,j=arr.size()-1;
        while(k<j){
            int temp=arr.get(k);
            arr.set(k,arr.get(j));
            arr.set(j,temp);
            k++;
            j--;

        }
        System.out.print(arr);
        System.out.print("\n");
        //Adding One to the last
        arr.set(arr.size()-1,(arr.get(arr.size()-1)+1));
        System.out.print("\n");
        System.out.print(arr);

    }

}
