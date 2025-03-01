import java.util.Scanner;
class A
{
	int id,sal,age;
	String name,des;
	A()
	{
		Scanner sc = new Scanner(System.in);
        	System.out.print("ID : ");
        	id = sc.nextInt();
        	System.out.print("Name : ");
        	name = sc.next();
        	System.out.print("Age : ");
        	age = sc.nextInt();
         	System.out.print("salary : ");
        	sal = sc.nextInt();
         	System.out.print("Designation : ");
       		des = sc.next();
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
class Demo4
{
    public static void main(String[] args) 
    {
        A  a = new A();		
	a.display();
    }
}