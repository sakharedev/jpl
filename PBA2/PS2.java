import java.util.Scanner;

abstract class Shape
{
    int a, b;
    abstract void printArea();
}
z
class Rectangle extends Shape
{
    void printArea()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle: ");
        a = sc.nextInt();
        System.out.print("Enter Breadth of Rectangle: ");
        b = sc.nextInt();
        System.out.println("Area of Rectangle: " + (a*b));
        sc.close();
    }
}

class Triangle extends Shape
{
    void printArea()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base of Triangle: ");
        a = sc.nextInt();
        System.out.print("Enter Height of Triangle: ");
        b = sc.nextInt();
        System.out.println("Area of Triangle: " + (0.5*a*b));
        sc.close();
    }
}

class Circle extends Shape
{
    void printArea()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        a = sc.nextInt();
        System.out.println("Area of Circle: " + (3.14*a*a));
        sc.close();
    }
}


public class PS2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Shape s;
        System.out.print("Enter Shape (Rectangle/Triangle/Circle): ");
        String shape = sc.next();
        if(shape.equals("Rectangle"))
        {
            s = new Rectangle();
            s.printArea();
        }
        else if(shape.equals("Triangle"))
        {
            s = new Triangle();
            s.printArea();
        }
        else if(shape.equals("Circle"))
        {
            s = new Circle();
            s.printArea();
        }
        else
        {
            System.out.println("Invalid Shape");
        }
        sc.close();
    }
}

