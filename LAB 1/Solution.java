import java.util.Scanner;

class Solution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = sc.nextInt();
		int flag = 0;
		for(int i = 2; i < number; i++)
		{
			if(number%i == 0)
			{
				flag = 0;
				break;
			}
			else
			{
				flag = 1;
			}
		}
		if(flag == 1)
		{
			System.out.println(number + " is Prime Number");
		}
		else
		{
			System.out.println(number + " is not a Prime Number");
		}
		sc.close();
	}
}
