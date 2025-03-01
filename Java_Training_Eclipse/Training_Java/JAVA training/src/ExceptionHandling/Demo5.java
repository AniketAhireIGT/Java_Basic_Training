package ExceptionHandling;
import java.util.Scanner;
import java.util.*;
class ABCD
{
	void display()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Valid Age : ");
		int age = sc.nextInt();
		
		if(age < 18)
		{
			throw new InvalidAgeException("Invalid age bcz is less than 18 : Min age");
			
		}
		else if(age>60) {
			throw new InvalidAgeException("Invalid Age bcz is greter 18 : Max age ");
		}
		else
		{
			System.out.println("Valid");
		}
	}
}
public class Demo5 {

	public static void main(String[] args) {
		try
		{
			ABCD a = new ABCD();
			a.display();
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}

	}
}

class InvalidAgeException extends RuntimeException
{
	InvalidAgeException(String msg)
	{
		super(msg);
	}
}
