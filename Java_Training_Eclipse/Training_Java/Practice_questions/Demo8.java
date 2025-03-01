import java.util.Scanner;
 
class Manager
{
		int id;
		byte  age;
		int salary=90000;
		String name; 
		String des= "Manager";
		Manager(){
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter ID:");
			 id=sc.nextInt();
			System.out.println("Enter Name:");
			 name=sc.next();	
			System.out.println("Enter Age:");
			age=sc.nextByte();
			//System.out.println("Enter salary:");  salary=sc.nextInt();	
			//System.out.println("Enter Designation:"); des=sc.next();	
 
		}
		void display()
		{ 
		System.out.println("====================");
		System.out.println("My Id is: " +id);
		System.out.println("My Name is:" +name);	
		System.out.println("My Age is: " +age);	
		System.out.println("My Salary is: " +salary);	
		System.out.println("My Designation is: " +des);
 
		}
		void raiseSalary()
		{
			salary=salary+ 40000;
		}
			// manager : 40000
			// dev : 30000
			// tester : 20000
			// clerk 10000
}
class Tester
{
		int id;
		int  age;
		int salary=30000;
		String name; 
		String des= "Tester";
		Tester(){
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter ID:");
			 id=sc.nextInt();
			System.out.println("Enter Name:");
			 name=sc.next();	
			System.out.println("Enter Age:");
			age=sc.nextInt();
			//System.out.println("Enter salary:");  salary=sc.nextInt();	
			//System.out.println("Enter Designation:"); des=sc.next();	
 
		}
		void display()
		{ 
		System.out.println("====================");
		System.out.println("My Id is: " +id);
		System.out.println("My Name is:" +name);	
		System.out.println("My Age is: " +age);	
		System.out.println("My Salary is: " +salary);	
		System.out.println("My Designation is: " +des);
 
		}
}
 
class Developer
{
		int id;
		int  age;
		int salary=50000;
		String name; 
		String des= "Developer";
		Developer(){
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter ID:");
			 id=sc.nextInt();
			System.out.println("Enter Name:");
			 name=sc.next();	
			System.out.println("Enter Age:");
			age=sc.nextInt();
			//System.out.println("Enter salary:");  salary=sc.nextInt();	
			//System.out.println("Enter Designation:"); des=sc.next();	
 
		}
		void display()
		{ 
		System.out.println("====================");
		System.out.println("My Id is: " +id);
		System.out.println("My Name is:" +name);	
		System.out.println("My Age is: " +age);	
		System.out.println("My Salary is: " +salary);	
		System.out.println("My Designation is: " +des);
 
		}
}
 
class Clerk
{
	int id;
		int  age;
		int salary=20000;
		String name; 
		String des= "Clerk";
		Clerk(){
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter ID:");
			 id=sc.nextInt();
			System.out.println("Enter Name:");
			 name=sc.next();	
			System.out.println("Enter Age:");
			age=sc.nextInt();
			//System.out.println("Enter salary:");  salary=sc.nextInt();	
			//System.out.println("Enter Designation:"); des=sc.next();	
 
		}
		void display()
		{ 
		System.out.println("====================");
		System.out.println("My Id is: " +id);
		System.out.println("My Name is:" +name);	
		System.out.println("My Age is: " +age);	
		System.out.println("My Salary is: " +salary);	
		System.out.println("My Designation is: " +des);
 
		}
		void raiseSalary()
		{
			salary=salary+ 40000;
		}
			// manager : 40000
			// dev : 30000
			// tester : 20000
			// clerk 10000

} 
class Demo8
{
	public static void main(String Args[])
	{
	
		Scanner sc = new Scanner(System.in);
		int ch1,ch2=0;
Manager m = null;Developer d = null; Tester t = null;Clerk c = null;
		do{
			System.out.println("1 ) Create ");
			System.out.println("2 ) Display ");
			System.out.println("3 ) Raise Salary  ");
			System.out.println("4 ) Exit ");
			ch1=sc.nextInt();
			if(ch1==1){
				do{
					System.out.println("	1 ) Manager ");
					System.out.println("	2 ) Developer ");
					System.out.println("	3 ) Tester ");
					System.out.println("	4 ) Clerk ");
					System.out.println("	5 ) Exit ");
					ch2=sc.nextInt();
					if(ch2==1){ m=new Manager();}
					if(ch2==2){ d=new Developer();}
					if(ch2==3){ t=new Tester();}
					if(ch2==4){ c=new Clerk();}
				}while(ch2!=5);
			}
			if(ch1==3){
				do{
					System.out.println("1 ) Manager ");
					System.out.println("2 ) Developer ");
					System.out.println("3 ) Tester ");
					System.out.println("4 ) Clerk ");
					System.out.println("5 ) Exit ");
					ch2=sc.nextInt();
					if(ch2==1){m.raiseSalary();}
					if(ch2==2){d.display();}
					if(ch2==3){t.display();}
					if(ch2==4){ c.display();}
				}while(ch2!=5);
			}
			if(ch1==2){
				do{
					System.out.println("1 ) Manager ");
					System.out.println("2 ) Developer ");
					System.out.println("3 ) Tester ");
					System.out.println("4 ) Clerk ");
					System.out.println("5 ) Exit ");
					ch2=sc.nextInt();
					if(ch2==1){m.display();}
					if(ch2==2){d.display();}
					if(ch2==3){t.display();}
					if(ch2==4){ c.display();}
				}while(ch2!=5);
			}
			

			if(ch1==4){
				System.out.println("Thank you ...!");
				System.exit(0);
			}
		}while(ch1!=4);
	}
}