package ArraysPrectice;

import java.util.ArrayList;
import java.util.Collections;

public class Prectice31 {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(9);
        arr.add(9);
        arr.add(9);
        arr.add(9);
        arr.add(9);

        System.out.println("Original Array: " + arr);

        int carry = 1;

        for (int i = arr.size() - 1; i >= 0; i--) {

            int sum = arr.get(i) + carry;

            if (sum <= 9) {
                arr.set(i, sum);
                carry = 0;
                break;
            } else {
                arr.set(i, 0);
                carry = 1;
            }
        }

        if (carry == 1) {
            arr.add(0, 1);
        }

        System.out.println("After +1: " + arr);
    }
}