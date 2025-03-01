package ExceptionHandling;

class A3 extends Thread
{
	public void run() 
	{
		for(int i=0;i<=10;i++) 
		{
			try 
			{
			System.out.println("I  :  "+i);
			Thread.sleep(1000);
			}
			catch(Exception e) 
			{}
		}
	}
}

class B3 extends Thread
{
	public void run() 
	{
		for(int i=0;i<=10;i++) 
		{
			try 
			{
				System.out.println("        J  :  "+i);
				Thread.sleep(1100);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
 
		}
	}
}
class C3 extends Thread
{
	public void run() {
		for(int i=0;i<=10;i++) 
		{
			try 
			{
				System.out.println("                K  :  "+i);
				Thread.sleep(1200);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
 
		}
	}
}
public class Demo9 
{
	public static void main(String args[])
	{
		A3 a=new A3();
		B3 b=new B3();
		C3 c=new C3();
		a.start();
		b.start();
		c.start();
	}
}