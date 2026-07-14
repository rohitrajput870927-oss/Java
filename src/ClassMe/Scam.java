package ClassMe;


class Shape {
    void display() {
        System.out.println("This is Shape class");
    }
}

class Circle extends Shape {
    void circleArea() {
        System.out.println("Area of Circle");
    }
}

class Rectangle extends Shape {
    void rectangleArea() {
        System.out.println("Area of Rectangle");
    }
}

class Test {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.display();
        c.circleArea();

        Rectangle r = new Rectangle();
        r.display();
        r.rectangleArea();
    }
}