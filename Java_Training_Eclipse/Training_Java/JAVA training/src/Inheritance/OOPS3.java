package Inheritance;

class parent3
{
	parent3()
	{
		System.out.println("Parent class constructor");
	}
	
}
class child3 extends parent3
{
	child3()
	{
		System.out.println("child class constructor");
	}
}
public class OOPS3 {

	public static void main(String[] args) {
		
		child3 c = new child3();
	
	}

}
