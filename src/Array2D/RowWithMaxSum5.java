package Array2D;

public class RowWithMaxSum5 {
    static void main() {
        int[][] arr={{6,0,1,3},{3,4,5,1},{3,8,5,4}};
        int max=arr[0][0];
        int index=-1;
        for(int i=0;i<arr.length;i++){
            int sum=0;//i=0 pe j=0,1,2,3,.. ke element print element karwayega fir i=1 pe same  also for i=2....
            for (int j = 0; j < arr[0].length; j++) {
                sum=sum+arr[i][j];
            }
            if(sum>max){
                max=sum;
                index=i;
            }
        }
        System.out.print("index: "+index+" "+"SUM:"+max);
    }
}
