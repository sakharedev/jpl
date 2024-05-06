import java.util.Scanner;

class Vehicle
{
    String color;
    int registrationNumber;
    String typeOfVehicle;
}

class Car extends Vehicle
{
    String make;
    int cc;
    String fuelType;
}

class Truck extends Vehicle
{
    String make;
    int cc;
    String fuelType;
}

class Motorcycle extends Vehicle
{
    String make;
    int cc;
    String fuelType;
}

class Practice
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Vehicle v = new Vehicle();
        System.out.println("----------Enter Vehicle Details----------");
        System.out.print("Enter Vehicle Registration Number: ");
        v.registrationNumber = sc.nextInt();
        System.out.print("Enter Type of Vehicle(Car/Truck/Motorcycle): ");
        v.typeOfVehicle = sc.next();
        System.out.print("Enter Color of Vehicle: ");
        v.color = sc.next();
        if (v.typeOfVehicle.equals("Car")) 
        {
            Car c = new Car();
            System.out.print("Enter Manufacturer of Car: ");
            c.make = sc.next();
            System.out.print("Enter CC Car: ");
            c.cc = sc.nextInt();
            System.out.print("Enter Fuel Type of Car: ");
            c.fuelType = sc.next();

            System.out.println("\n\n----------Vehicle Details----------");
            System.out.println("Registration Number of Car: " + v.registrationNumber);
            System.out.println("Color of Car: " + v.color);
            System.out.println("Type of Vehicle: " + v.typeOfVehicle);
            System.out.println("CC of the Car: " + c.cc);
            System.out.println("Manufacturer of Car: " + c.make);
            System.out.println("Fuel Type: " + c.fuelType);
            System.out.print("\n\n");
        }
        else if(v.typeOfVehicle.equals("Truck"))
        {
            Truck t = new Truck();
            System.out.print("Enter Manufacturer of Truck: ");
            t.make = sc.next();
            System.out.print("Enter CC of Truck: ");
            t.cc = sc.nextInt();
            System.out.print("Enter Fuel Type of Truck: ");
            t.fuelType = sc.next();


            System.out.println("\n\n----------Vehicle Details----------");
            System.out.println("Registration Number of Truck: " + v.registrationNumber);
            System.out.println("Color of Truck: " + v.color);
            System.out.println("Type of Vehicle: " + v.typeOfVehicle);
            System.out.println("CC of the Truck: " + t.cc);
            System.out.println("Manufacturer of Truck: " + t.make);
            System.out.println("Fuel Type: " + t.fuelType);
            System.out.print("\n\n");
        }

        else if(v.typeOfVehicle.equals("Motorcycle"))
        {
            Motorcycle m = new Motorcycle();
            System.out.print("Enter Manufacturer of Motorcycle: ");
            m.make = sc.next();
            System.out.print("Enter CC of Motorcycle: ");
            m.cc = sc.nextInt();
            System.out.print("Enter Fuel Type of Motorcycle: ");
            m.fuelType = sc.next();

            System.out.println("\n\n----------Vehicle Details----------");
            System.out.println("Registration Number of Motorcycle: " + v.registrationNumber);
            System.out.println("Color of Motorcycle: " + v.color);
            System.out.println("Type of Vehicle: " + v.typeOfVehicle);
            System.out.println("CC of the Motorcycle: " + m.cc);
            System.out.println("Manufacturer of Motorcycle: " + m.make);
            System.out.println("Fuel Type: " + m.fuelType);
            System.out.print("\n\n");
        }

        sc.close();
    }
}
