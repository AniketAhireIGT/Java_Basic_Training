import java.util.Scanner;
class Manager
{
		short id;
		byte  age;
		int salary=90000;
		int updatedSalary;
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
		void raiseSalary()
		{
		    System.out.println("Old Salary : 90000");
		    updatedSalary=salary+40000;
		    System.out.println("Updated Salary : "+updatedSalary);
		}
}
class Tester
{
		int id;
		byte  age;
		int salary=30000;
		int updatedSalary;
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
		void raiseSalary()
		{
		    System.out.println("Old Salary : 90000");
		    updatedSalary=salary+20000;
		    System.out.println("Updated Salary : "+updatedSalary);
		}
}
class Developer
{
		int id;
		byte  age;
		int salary=50000;
		int updatedSalary;
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
		void raiseSalary()
		{
		    System.out.println("Old Salary : 50000");
		    updatedSalary=salary+30000;
		    System.out.println("Updated Salary : "+updatedSalary);
		}
}
class Clerk
{
	int id;
		byte  age;
		int salary=20000;
		int updatedSalary;
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
		void raiseSalary()
		{
		     System.out.println("Old Salary : 20000");
		    updatedSalary=salary+10000;
		    System.out.println("Updated Salary : "+updatedSalary);
		}
}

class project1
{
	public static void main(String Args[])
	{
	    Scanner sc= new Scanner(System.in);
	    int ch1,ch2=0;
		Manager m =null;
		Tester t=null;
		Developer d=null;
		Clerk c=null;
		do{
		    System.out.println("*************************");
		    System.out.println("1. Create");
		    System.out.println("2. Display");
		    System.out.println("3. Salary Raise");
		    System.out.println("4. Exit");
		    System.out.println("*************************");
		    System.out.print("Enter Choice: ");
		    ch1=sc.nextInt();
		    if(ch1==1)
		    {
		        do
		        {
		            System.out.println("*************************");
		            System.out.println("1. Manager");
		            System.out.println("2. Developer");
		            System.out.println("3. Tester");
		            System.out.println("4. Clerk");
		            System.out.println("5. Exit");
		            System.out.println("*************************");
		            System.out.print("Enter Choice: ");
		            ch2=sc.nextInt();
		            if(ch2==1)
		            {
		                 m=new Manager();
		            }
		            if(ch2==2)
		            {
		                 d=new Developer();
		            }
		            if(ch2==3)
		            {
		                t=new Tester();
		            }
		            if(ch2==4)
		            {
		                c=new Clerk();
		            }
		        }while(ch2!=5);
		    }
		    if(ch1==2)
		    {
		        do
		        {
		            System.out.println("*************************");
		            System.out.println("1. Manager");
		            System.out.println("2. Developer");
		            System.out.println("3. Tester");
		            System.out.println("4. Clerk");
		            System.out.println("5. Exit");
		            System.out.println("*************************");
		            System.out.print("Enter Choice: ");
		            ch2=sc.nextInt();
		            if(ch2==1)
		            {
		                 m.display();
		            }
		            if(ch2==2)
		            {
		                 d.display();
		            }
		            if(ch2==3)
		            {
		                t.display();
		            }
		            if(ch2==4)
		            {
		                c.display();
		            }
		        }while(ch2!=5);
		    }
		    if(ch1==3)
		    {
		        do
		        {
		            System.out.println("*************************");
		            System.out.println("1. Manager");
		            System.out.println("2. Developer");
		            System.out.println("3. Tester");
		            System.out.println("4. Clerk");
		            System.out.println("5. Exit");
		            System.out.println("*************************");
		            System.out.print("Enter Choice: ");
		            ch2=sc.nextInt();
		            if(ch2==1)
		            {
		                 m.raiseSalary();
		            }
		            if(ch2==2)
		            {
		                 d.raiseSalary();
		            }
		            if(ch2==3)
		            {
		                t.raiseSalary();
		            }
		            if(ch2==4)
		            {
		                c.raiseSalary();
		            }
		        }while(ch2!=5);
		    }
		    if(ch1==4)
		    {
		        System.out.println("THank you..");
		    }

		}while(ch1!=4);

	}
}