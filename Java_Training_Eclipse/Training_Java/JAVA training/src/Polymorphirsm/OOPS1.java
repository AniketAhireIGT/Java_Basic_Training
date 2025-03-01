package Polymorphirsm;

//Method Overloading

class A
{
	A()
	{
		System.out.println("A()");
	}
	A(int a)
	{
		System.out.println("A(int a)");
	}
	A(int a,int b)
	{
		System.out.println("A(int a,int b)");
	}
	A(String a)
	{
		System.out.println("A(String a)");
	}
	void draw(int r)
	{
		System.out.println(r*r*2);
	}
	void draw(int l,int b)
	{
		System.out.println(l*b);
	}
}
public class OOPS1 {
	public static void main(String[] args) {
		A a = new A();
		a.draw(10);
		a.draw(10,30);
		A a1 = new A(100);
		A a2 =new A(100,200);
		A a3 = new A("Aniket");
	}
}
