package Inheritance;
class Emp
{
	
}
class Clerk1 extends Emp
{
	Address a = new Address();	
}

class Dev extends Emp
{
	Address a = new Address();
	void display()
	{
		System.out.println("PIN : "+a.pin);
	}
}
class Address
{
	int pin = 9988;
	String street = " 5th main";
}
public class OOPS4 {
	public static void main(String[] args) {	
		Dev d = new Dev();
		d.display();
	}
}
