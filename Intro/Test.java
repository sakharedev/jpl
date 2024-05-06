import java.util.Scanner;
class Test
{
	public static void main(String[] args)
	{
		int num1, num2, num3, num4;
		Scanner input = new Scanner(System.in);
		System.out.print("Input First Number: ");
		num1 = input.nextInt();
		System.out.print("Input Second Number: ");
		num2 = input.nextInt();
		System.out.print("Input Third Number: ");
		num3 = input.nextInt();
		System.out.print("Input Third Number: ");
		num4 = input.nextInt();
		
		if(num1 == num2 & num2 == num3 & num3 == num4)
		{
			System.out.println("All numbers a Equal");
		}
		else
		{
			System.out.println("All numbers are not Equal");
		}
		input.close();
	}
}