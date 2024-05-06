import java.util.*;
public class lab
{
    public static void main(String args[])
    {
        int num1, num2, num3, num4;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();
        sc.close();
        if (num1 == num2 & num2 == num3 & num3 == num4)  
        {
            System.out.println("All Numbers are Equal");
        }
        else
        {
            System.out.println("Some Numbers are Different");
        }
    }
}