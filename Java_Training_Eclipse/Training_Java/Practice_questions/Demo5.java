import java.util.Scanner;
// Tester 	: salary =30000 
// Developer	: salary = 50000
// Clerk	: salary = 20000
class Manager
{
	int id,age;
	int sal=90000;
	String name;
	String des="Manager";
	Manager()
	{
		Scanner sc = new Scanner(System.in);
        	System.out.print("ID : ");
        	id = sc.nextInt();
        	System.out.print("Name : ");
        	name = sc.next();
        	System.out.print("Age : ");
        	age = sc.nextInt();
         	//System.out.print("salary : ");      sal = sc.nextInt();
         	//System.out.print("Designation : ");des = sc.next();
	}
	void display()
	{
		System.out.println("======================");
        	System.out.println("My ID is : "+id);
        	System.out.println("My Name is : "+name);
        	System.out.println("My Age is : "+age);
      		System.out.println("My salary is : "+sal);
        	System.out.println("My Designation is : "+des);
	}
}
class Demo5
{
    public static void main(String[] args) 
    {
        Manager m = new Manager();	m.display();
	// Developer obj  with Method/ tester obj  with Method / Clerk obj  with Method 
    }
}