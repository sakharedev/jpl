package Inheritance;
public class Student
{
    String name, city;
    int age;

    void addData(String name, String city, int age)
    {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    void printData()
    {
        System.out.println("Name of Student: " + name);
        System.out.println("City of Student: " + city);
        System.out.println("Age of Student: " + age);
    }

    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.addData("Paras", "Pune", 19);
        s1.printData();
        System.out.println("=".repeat(30));
        Student s2 = new Student();
        s2.addData("Sakhare", "Pune", 20);
        s1.printData();
    }
}