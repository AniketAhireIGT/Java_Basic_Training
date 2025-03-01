package ExceptionHandling;
class x
{
	x(){}
	x(String name)
	{
		System.out.println("x(String name)");
	}
	void abc()
	{
		System.out.println("Hi XYZ method");
	}
}
class y extends x
{
	y()
	{
		this(100);
		System.out.println("Hi y()");
	}
	y(int a)
	{
		super("Aniket");
		System.out.println("Hi Y(int a)");
	}
	void abc()
	{
		super.abc();
		System.out.println("Hi ABC Method.....!");
	}
}
public class Demo6 {

	public static void main(String[] args) 
	{
		y a = new y();
		a.abc();	
	}
}
