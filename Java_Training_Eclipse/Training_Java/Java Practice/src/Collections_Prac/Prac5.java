package Collections_Prac;
import java.util.*;
import java.util.Scanner;

public class Prac5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		try
		{
//		System.out.print("Enter Roll No : ");
//		int roll = sc.nextInt();
//		System.out.print("Enter Name : ");
//		String name =sc.next();
//		
//		System.out.println("Roll No : "+roll);
//		System.out.println("Name    : "+name);
			
			System.out.println("Enter a : ");
			int a = sc.nextInt();
			System.out.println("Enter B : ");
			int b = sc.nextInt();
			
			System.out.println("Answer : 1"+ a/b);
		}
		catch(ArithmeticException at) 
		{
			System.out.println("can not dvied by o");
		}	
		catch(InputMismatchException ie) 
		{
			System.out.println("incorrect input");
		}	
		catch(Exception e) 
		{
			System.out.println(e);
		}	

	}

}
