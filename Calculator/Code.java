package Calculator;
import java.util.Scanner;

public class Code
{
    int a, b, result;
    float a1, b1, result1;
    
    int add(int a, int b) {
        return a+b;
        // return result;
    }

    float add(float a, float b) {
        result1 = a+b;
        return result1;
    }

    int sub(int a, int b) {
        result = a-b;
        return result;
    }

    float sub(float a, float b) {
        result1 = a-b;
        return result1;
    }

    public int multi(int a, int b) {
        result = a*b;
        return result;
    }

    float multi(float a, float b) {
        result1 = a*b;
        return result1;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            Code c = new Code();
            c.a = 14;
            c.b = 13;
            c.a1 = (float) 2.6;
            c.b1 = 3.5f;
            while(true) {
                System.out.println("**********MENU**********");
                System.out.println("1. Add_Int");
                System.out.println("2. Sub_Int");
                System.out.println("3. Multi_Int");
                System.out.println("4. Add_Float");
                System.out.println("5. Sub_Float");
                System.out.println("6. Multi_Float");
                System.out.println("7. Exit");

                
                System.out.print("Enter Your Choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Result: " + c.add(c.a, c.b));
                        break;
                    case 2:
                        System.out.println("Result: " + c.sub(c.a, c.b));
                    case 3:
                        System.out.println("Result: " + c.multi(c.a, c.b));
                        break;
                    case 4:
                        System.out.println("Result: " + c.add(c.a1, c.b1));
                        break;
                    case 5:
                        System.out.println("Result: " + c.sub(c.a1, c.b1));
                        break;
                    case 6:
                        System.out.println("Result: " + c.multi(c.a1, c.b1));
                    case 7:
                        System.out.println("Exiting......");
                        System.exit(0);
                    default:
                        System.out.println("Enter Proper Input");
                        break;
                }
            }
        }
    }
}