import java.util.Scanner;
class A
{
	A()
	{
		System.out.println("Hi Constructro...!");
	}
	void display()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Hi method...!");
		}
	}
}
class Demo3 
{
    public static void main(String[] args) 
    {
        A  a = new A(); // 		
	a.display();	// 
	a.display();
	a.display();
	a.display();	
    }
}
// as soon we create cons : auto call but we have to call manually 
// Constr: will not have return type  but method yes we will have 
// construct : only once per object  but method u can call meny time