package Abstraction;

class sbi extends Bank
{
	void ATM()
	{
		System.out.println("Master Card");
	}
	void FD()
	{
		System.out.println("10%");
	}
}

class Axis extends Bank
{
	void ATM() 
	{
		System.out.println("Platinum card");
	}

	void FD() 
	{
		System.out.println("12%");
	}
}
public class demo1 
{
	public static void main(String[] args)
{
		sbi s = new sbi();
		s.ATM();
		s.FD();
		Axis a = new Axis();
		a.ATM();
		a.FD();
	}

}
