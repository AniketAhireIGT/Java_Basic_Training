package Inheritance;

class parent
{
	int site=5;
	int money=50000;
	String car="Benz";
}
class child extends parent
{
	int money=6000;
	void display(int money)
	{
		System.out.println("site :" + site);
		System.out.println("child money :" + money);
		System.out.println("p money :" + super.money);
		System.out.println("car :" + car);
	}
}
public class OOPS1 {

	public static void main(String[] args) {
		child c = new child();
		c.display(8888);

	}

}
