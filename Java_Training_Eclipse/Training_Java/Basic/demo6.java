import java.util.Scanner;
 
class Manager
{
		short id;
		byte  age;
		int salary=90000;
		String name; 
		String des= "Manager";
		Manager(){
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter ID:");
			 id=sc.nextShort();
			System.out.print("Enter Name:");
			 name=sc.next();	
			System.out.print("Enter Age:");
			age=sc.nextByte();

 
		}
		void display()
		{ 
		System.out.println("====================");
		System.out.println("My Id is: " +id);
		System.out.println("My Name is:" +name);	
		System.out.println("My Age is: " +age);	
		System.out.println("My Salary is: " +salary);	
		System.out.println("My Designation is: " +des);
		System.out.println("====================");
 
		}
}
class Tester
{
		int id;
		byte  age;
		int salary=30000;
		String name; 
		String des= "Tester";
		Tester(){
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter ID:");
			 id=sc.nextShort();
			System.out.print("Enter Name:");
			 name=sc.next();	
			System.out.print("Enter Age:");
			age=sc.nextByte();
			
 
		}
		void display()
		{ 
		System.out.println("====================");
		System.out.println("My Id is: " +id);
		System.out.println("My Name is:" +name);	
		System.out.println("My Age is: " +age);	
		System.out.println("My Salary is: " +salary);	
		System.out.println("My Designation is: " +des);
			System.out.println("====================");
 
		}
}
 
class Developer
{
		int id;
		byte  age;
		int salary=50000;
		String name; 
		String des= "Developer";
		Developer(){
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter ID:");
			 id=sc.nextShort();
			System.out.print("Enter Name:");
			 name=sc.next();	
			System.out.print("Enter Age:");
			age=sc.nextByte();
	
 
		}
		void display()
		{ 
		System.out.println("====================");
		System.out.println("My Id is: " +id);
		System.out.println("My Name is:" +name);	
		System.out.println("My Age is: " +age);	
		System.out.println("My Salary is: " +salary);	
		System.out.println("My Designation is: " +des);
			System.out.println("====================");
 
		}
}
 
class Clerk
{
	int id;
		byte  age;
		int salary=20000;
		String name; 
		String des= "Clerk";
		Clerk(){
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter ID:");
			 id=sc.nextShort();
			System.out.print("Enter Name:");
			 name=sc.next();	
			System.out.print("Enter Age:");
			age=sc.nextByte();
			
 
		}
		void display()
		{ 
		System.out.println("====================");
		System.out.println("My Id is: " +id);
		System.out.println("My Name is:" +name);	
		System.out.println("My Age is: " +age);	
		System.out.println("My Salary is: " +salary);	
		System.out.println("My Designation is: " +des);
			System.out.println("====================");
 
		}
}
 
 
class demo6
{
	public static void main(String Args[])
	{
		Manager m=new Manager();
		m.display();	
		Tester t=new Tester();
		t.display();	
		Developer d=new Developer();
		d.display();
		Clerk c=new Clerk();
		c.display();		
	}
}