package ArraysPrectice;

public class prectice23 {
    static void main() {
        int[] arr={7,2,5,1,3,2};
        int target=6;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("The element and index is:"+"Index:"+ "+i+"+"j"+" "+"element: "+arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
