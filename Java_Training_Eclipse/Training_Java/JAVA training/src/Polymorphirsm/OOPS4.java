package Polymorphirsm;
 
class car
{
	final int speed = 200;
	String model = "2020";
	int price = 100000;
	
	void gare()
	{
		System.out.println("5 Gares");
	}
}

class Benz extends car
{
	void gare()
	{
		System.out.println("Non gare");
	}
}

class BMW extends car
{
	
}
public class OOPS4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car c = new car();
		System.out.println(c.speed);
	}
}

//if var : we cant modify
//if method : we can not override
//if class :we can not inherit
