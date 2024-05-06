import java.util.Scanner;

class Student
{
    Scanner sc = new Scanner(System.in);
    private int rollno;
    private String name;
    void getData()
    {
        System.out.print("Enter Roll No.: ");
        rollno = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
    }
    void printData()
    {
        System.out.println("=".repeat(35));
        System.out.println("Roll No. is " + this.rollno + " and Name is " + this.name);
    }
}

class Code
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.getData();
        s2.getData();
        s1.printData();
        s2.printData();
        System.out.println("=".repeat(35));
    }
}
