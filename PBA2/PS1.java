import java.util.Scanner;

class Vehicle
{
    int registrationNumber;
    String color;
    String typeOfvehicle;
}

class Car extends Vehicle
{
    String manufacturer;
    int cc;
    String fuelType;
}

class Truck extends Vehicle
{
    String manufacturer;
    int cc;
    String fuelType;
}

class Motorcycle extends Vehicle
{
    String manufacturer;
    int cc;
    String fuelType;
}

public class PS1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Vehicle v = new Vehicle();
        System.out.println("----------Enter Details of Vehicle----------");
        System.out.print("Enter Registration Number: ");
        v.registrationNumber = sc.nextInt();
        System.out.print("Enter Colour of the Vehicle: ");
        // sc.next();
        v.color = sc.next();
        System.out.print("Enter Type of Vehicle (Car/Truck/Motorcycle): ");
        // sc.next();
        v.typeOfvehicle = sc.next();
        System.out.println(v.typeOfvehicle);
        if(v.typeOfvehicle.equals("Car"))
        {
            Car c1 = new Car();
            System.out.print("Enter CC of the Car: ");
            c1.cc = sc.nextInt();
            System.out.print("Enter Manufacturer of Car: ");
            c1.manufacturer = sc.next();
            System.out.print("Enter Fuel Type: ");
            c1.fuelType = sc.next();

            System.out.println("\n\n----------Vehicle Details----------\n\n");
            System.out.println("Registration Number of Car: " + v.registrationNumber);
            System.out.println("Color of Car: " + v.color);
            System.out.println("Type of Vehicle: " + v.typeOfvehicle);
            System.out.println("CC of the Car: " + c1.cc);
            System.out.println("Manufacturer of Car: " + c1.manufacturer);
            System.out.println("Fuel Type: " + c1.fuelType);
            System.out.print("\n\n");
        }
        else if(v.typeOfvehicle.equals("Truck"))
        {
            Truck t1 = new Truck();
            System.out.print("Enter CC of the Truck: ");
            t1.cc = sc.nextInt();
            System.out.print("Enter Manufacturer of Truck: ");
            t1.manufacturer = sc.next();
            System.out.print("Enter Fuel Type: ");
            t1.fuelType = sc.next();
            System.out.println("\n\n----------Vehicle Details----------\n\n");
            System.out.println("Registration Number of Truck: " + v.registrationNumber);
            System.out.println("Color of Truck: " + v.color);
            System.out.println("Type of Vehicle: " + v.typeOfvehicle);
            System.out.println("CC of the Truck: " + t1.cc);
            System.out.println("Manufacturer of Truck: " + t1.manufacturer);
            System.out.println("Fuel Type: " + t1.fuelType);
            System.out.print("\n\n");
        }
        else if(v.typeOfvehicle.equals("Motorcycle"))
        {
            Motorcycle m1 = new Motorcycle();
            System.out.print("Enter CC of the Motorcycle: ");
            m1.cc = sc.nextInt();
            System.out.print("Enter Manufacturer of Motorcycle: ");
            m1.manufacturer = sc.next();
            System.out.print("Enter Fuel Type: ");
            m1.fuelType = sc.next();
            System.out.println("\n\n----------Vehicle Details----------\n\n");
            System.out.println("Registration Number of Motorcycle: " + v.registrationNumber);
            System.out.println("Color of Motorcycle: " + v.color);
            System.out.println("Type of Vehicle: " + v.typeOfvehicle);
            System.out.println("CC of the Motorcycle: " + m1.cc);
            System.out.println("Manufacturer of Motorcycle: " + m1.manufacturer);
            System.out.println("Fuel Type: " + m1.fuelType);
            System.out.print("\n\n");
        }
        

        sc.close();
    }
}