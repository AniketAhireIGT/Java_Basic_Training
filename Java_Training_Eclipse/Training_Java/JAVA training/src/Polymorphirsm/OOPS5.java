package Polymorphirsm;

//Static Keyword

class S
{
	static int x = 10000;
	
	static void display()
	{
		System.out.println("Hiiiii");
		
	}
	public static void main(String args)
	{
		System.out.println("M1 "+args);
	}
}

public class OOPS5 
{
	public static void main(String[] args) 
	{
		
		S.display();
		S.main("Aniket");
		System.out.println(S.x);
	}

}
