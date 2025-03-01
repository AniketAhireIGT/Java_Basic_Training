package Polymorphirsm;

//Method Overriding

class Bank
{
	public void roi()
	{
		System.out.println("10%");
	}
}

class Axis extends Bank
{
	public void roi()
	{
		System.out.println("12%");
	}
}

public class OOPS2 
{
	public static void main(String[] args)
	{
		Bank b = new Bank();
		b.roi();
		Axis a = new Axis();
		a.roi();
	}

}
