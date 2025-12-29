package Method;

public class ReturnImportant9 {
    static void main() {
        System.out.print(e(8));//sirf call karne me pura kam nahi karega

    }
    static int e(int a){
        if(a<9){
            return a;//or isame if laga hai to else bhi hona chahiye nahi to error dega
        }
        else{
            return 0;
        }


    }
}
