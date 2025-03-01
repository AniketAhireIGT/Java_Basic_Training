package ExceptionHandling;

class A
{
	void display()
	{
		String name="Aniket";
		System.out.println("Name : "+name.length());
		//name = null;
		System.out.println("Name : "+name.length());// NullPointerException
		int arr[] = {5,3,4,6,7,8};
		//System.out.println(arr[7]); //ArrayIndexOutOfBoundException
		String id = "100 ";
		int uid = Integer.parseInt(id);
		System.out.println(uid);
	}
}

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.display();
	}

}
