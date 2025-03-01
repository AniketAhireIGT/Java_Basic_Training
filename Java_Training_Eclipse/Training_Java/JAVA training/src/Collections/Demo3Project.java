package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Collections2.Clerk;
import Collections2.Developer;
import Collections2.Emp;

class Emp
{
	int id;
	int age;
	int salary;
	String name;
	String desig;
	Scanner sc = new Scanner(System.in);
	Emp()
	{
		System.out.print("ID : ");
		id=sc.nextInt();
		System.out.print("Name : ");
		name= sc.next();
		System.out.print("Age : ");
		age=sc.nextInt();
	}
	void display()
	{
		System.out.println("*********************************");
		System.out.println("Name        : "+name);
		System.out.println("Id          : "+id);
		System.out.println("Salary      : "+salary);
		System.out.println("Age         : "+age);
		System.out.println("Designation : "+desig);
		System.out.println("*********************************");
	}
}
class Clerk extends Emp
{
	public Clerk()
	{
		salary = 30000;
		desig = "Clerk";
	}
}
class Developer extends Emp
{
	public Developer()
	{
		salary=50000;
		desig="Developer";
	}
}

public class Demo3Project {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int ch1=0;
		int ch2=0;
		ArrayList<Emp> al = new ArrayList<Emp>();
		
		do 
		{
			System.out.println("================================================");
			System.out.println("1. Create");
			System.out.println("2. Display");
			System.out.println("3. Exit");
			System.out.println("================================================");
			System.out.print("Enter Your Choice : ");
			ch1 = sc.nextInt();
			
			if(ch1==1)
			{
				//Create
				do
				{
					System.out.println("================================================");
					System.out.println("1. Clerk");
					System.out.println("2. Developer");
					System.out.println("3. Exit");
					System.out.println("================================================");
					System.out.print("Enter Your Choice : ");
					ch2=sc.nextInt();
					if(ch2==1)
					{
						al.add(new Clerk());
					}
					if(ch2==2)
					{
						al.add(new Developer());
					}
				}while(ch2!=3);
			}
			else if(ch1==2)
			{
				//Display...
				Iterator i = al.iterator();
				while(i.hasNext())
				{
					Emp e = (Emp)i.next();
					e.display();
				}
			}
			else if(ch1==3)
			{
				//Exit....
				System.out.println("Thank You.....!");
				System.exit(0);
			}
			else 
			{
				System.out.println("Invalid choice, Please Try Agin....!");
			}
		} while (ch1!=3);

	}

}
