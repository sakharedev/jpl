package Inheritance;
import java.util.Scanner;

public class Vehicles 
{
    int registrationNumber;
    String color, typeOfvehicles;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Car c1 = new Car();
        c1.getData();
        c1.printData();
    }    
}

class Car extends Vehicles
{
    int CC;
    String fuelType, name;
    void getData()
    {
        System.out.print("Enter Name of Car: ");
        name = sc.nextLine();
        System.out.print("Enter the Registration Number: ");
        registrationNumber = sc.nextInt();
        System.out.print("Enter Color: ");
        color = sc.next();
    }
    void printData()
    {
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Color: " + color);
    }
}

class Truck extends Vehicles
{
    int CC;
    String fuelType;
}

class Motocycle extends Vehicles
{
    int CC;
    String fuelType;
}
