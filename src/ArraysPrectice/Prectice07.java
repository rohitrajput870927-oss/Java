package ArraysPrectice;

public class Prectice07 {
    static void main() {
        int[] arr={8,3,5,49,9};
        int terget=9;
        boolean found=false;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==terget){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("yes");
        }
        else {
            System.out.println("not");
        }

    }
}
