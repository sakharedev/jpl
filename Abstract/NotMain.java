package Abstract;

abstract class Shape {
    int length, breadth;
    abstract int printArea(int length,int breadth);
}

class Rectangle extends Shape {
    int printArea(int length, int breadth) {
        return length * breadth;
    }
}

class Square extends Shape {
    int printArea(int length, int breadth) {
        return length * length;
    }
}

public class NotMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.printArea(10, 12));
        Square c = new Square();
        System.out.println(c.printArea(12, 12));
    }
}