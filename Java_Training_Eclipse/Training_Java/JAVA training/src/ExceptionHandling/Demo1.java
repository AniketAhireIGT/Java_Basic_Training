package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 
{
	public static void main(String[] args)
	{
		m1();
	}
	static void m1()
	{
		m2();
		System.out.println("Hi M1 Methods......!");
	}
	static void m2()
	{
		m3();
		System.out.println("Hi M2 Methods......!");
	}
	static void m3()
	{
		try
		{
			System.out.println("Hi M3 Methods......!");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter value A : ");
			int a = sc.nextInt();
			System.out.print("Enter Value B : ");
			int b = sc.nextInt();
			int res = a/b;
			System.out.println("Answer : "+res);
		}
		catch(InputMismatchException me )
		{
			System.out.println("Boss please enter number only");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Boss cant divied any thing by 0");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Thank You.....!");
		}
	}

}
