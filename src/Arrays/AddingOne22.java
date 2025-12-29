package Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class AddingOne22 {
    static void main() {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(8);
        arr.add(9);
        arr.add(9);
        arr.add(8);
        arr.add(3);
        arr.add(9);
        arr.add(8);
        arr.add(9);
        System.out.print("Arr is: ");
        System.out.print(arr);
        System.out.print("\n");
        int n=arr.size();//size
        int carry=1;
        for(int i=n-1;i>=0;i--){
            if(arr.get(i)+carry<=9){
                arr.add(arr.get(i)+carry);
                carry=0;
            }
            else{
                arr.add(0);
                carry=1;
            }

        }
        if(carry==1){
            arr.add(1);
        }
        System.out.print(arr);
        System.out.print("\n");
        System.out.print("After reversed arr");
        Collections.reverse(arr);
        System.out.print(arr);





    }
}
