class A
{
	A()
	{
		System.out.println("HI A class ");
	}
}
class B
{
	B()
	{
		System.out.println("HI B class ");
	}
}
class Demo1
{
	public static void main(String args[])
	{
		System.out.println("HI Welcome to Java ");
		A a = new A();
		B b = new B();	
	}
}