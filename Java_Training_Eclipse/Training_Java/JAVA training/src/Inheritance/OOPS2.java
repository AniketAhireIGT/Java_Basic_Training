package Inheritance;


class parent2
{
	int site = 1000;
}
class child2 extends parent2
{
	int site = 100;
	
	void display(int site)
	{
		System.out.println("Site : "+site);
		System.out.println("Site : "+this.site);
		System.out.println("Site : "+super.site);
	}
}
public class OOPS2 {

	public static void main(String[] args) {
		
		child2 c = new child2();
		c.display(10);
	}

}
