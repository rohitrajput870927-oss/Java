package ClassMe;

public class InheritenceSingle01 {
    static void main() {
       electricCar c=new electricCar();
       c.Type();
       c.wheel();
       c.feature();

    }
}
class vechile{
    void Type(){
        System.out.println("it has many type");
    }
}
class car extends vechile{
    void wheel(){
        System.out.println("it has 4 wheel");
    }
}
class electricCar extends car{
    void feature(){
        System.out.println("it has no need of petrol");
    }
}

