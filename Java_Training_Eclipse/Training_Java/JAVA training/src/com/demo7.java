package com;

class AB
{
	int a;
	AB(){};                  //class has constructor
	void abc() {}            //class has only simple methods or non abstract methhos
	//abstract void xyz();   //class doest not have abstract methods
}

class A1{}
class A2 extends A1{}        // class does not supports multiple inheritance

                              // AB ab = new AB();   class has to create object
///////////////////////////====================================================///////////////////////////////

abstract class B
{
	int b;
	B(){}                  ////abstract class has also constructor
	void abc() {}
	abstract void xyz();
}

interface I
{
	public static final int i=100;
	public static final int s = 0;
	void aaa();
	public abstract void xyz();
}

interface J
{
	
}

interface k extends I,J{}

public class demo7 {
	public static void main(String args[])
	{
		A a = new A();
		System.out.println(a.a);
		B b = new B();
		I i = new I();
	}
}