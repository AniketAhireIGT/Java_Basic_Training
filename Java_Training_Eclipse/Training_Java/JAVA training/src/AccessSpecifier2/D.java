package AccessSpecifier2;

import AccessSpecifier.A;

public class D extends A
{
	void display()
	{
		//System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(d);
	}
}

class E extends D
{
	void display()
	{
		//System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(d);
	}
}

class F
{
	void display()
	{
		A a1 = new A();
		//System.out.println(a1.a);
		System.out.println(a1.b);
		//System.out.println(a1.c);
		//System.out.println(a1.d);
	}
}
