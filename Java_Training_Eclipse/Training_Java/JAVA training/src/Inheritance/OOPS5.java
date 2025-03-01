package Inheritance;
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

}
class Tester extends Manager
{
		int id;
		byte  age;
		int salary=30000;
		int updatedSalary;
		String name; 
		String des= "Tester";
		Tester(){
			
		}
		void display()
		{ 
		
		}
		
}
class Developer  extends Manager
{
		int id;
		byte  age;
		int salary=50000;
		int updatedSalary;
		String name; 
		String des= "Developer";
		Developer(){
			

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
class Clerk extends Manager
{
	int id;
		byte  age;
		int salary=20000;
		int updatedSalary;
		String name; 
		String des= "Clerk";
		Clerk(){
			

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

public class OOPS5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch1, ch2 = 0;
        Manager m = null;
        Tester t = null;
        Developer d = null;
        Clerk c = null;

        do {
            System.out.println("*************************");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Exit");
            System.out.println("*************************");
            System.out.print("Enter Choice: ");
            ch1 = sc.nextInt();

            if (ch1 == 1) {
                do {
                    System.out.println("*************************");
                    System.out.println("1. Manager");
                    System.out.println("2. Developer");
                    System.out.println("3. Tester");
                    System.out.println("4. Clerk");
                    System.out.println("5. Exit");
                    System.out.println("*************************");
                    System.out.print("Enter Choice: ");
                    ch2 = sc.nextInt();
                    
                    if (ch2 == 1) m = new Manager();
                    if (ch2 == 2) d = new Developer();
                    if (ch2 == 3) t = new Tester();
                    if (ch2 == 4) c = new Clerk();
                } while (ch2 != 5);
            }

            if (ch1 == 2) {
                do {
                    System.out.println("*************************");
                    System.out.println("1. Manager");
                    System.out.println("2. Developer");
                    System.out.println("3. Tester");
                    System.out.println("4. Clerk");
                    System.out.println("5. Exit");
                    System.out.println("*************************");
                    System.out.print("Enter Choice: ");
                    ch2 = sc.nextInt();
                    
                    if (ch2 == 1 && m != null) m.display(); 
                    else if (ch2 == 1) System.out.println("Manager not created yet.");
                    
                    if (ch2 == 2 && d != null) d.display();
                    else if (ch2 == 2) System.out.println("Developer not created yet.");
                    
                    if (ch2 == 3 && t != null) t.display(); 
                    else if (ch2 == 3) System.out.println("Tester not created yet.");
                    
                    if (ch2 == 4 && c != null) c.display();
                    else if (ch2 == 4) System.out.println("Clerk not created yet.");
                    
                } while (ch2 != 5);
            }

           

            if (ch1 == 3) {
                System.out.println("Thank you..");
            }
        } while (ch1 != 3);
    }
}
