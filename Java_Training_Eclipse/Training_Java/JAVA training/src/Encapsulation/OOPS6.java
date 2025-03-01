package Encapsulation;
  //encapsulated class or pojo class or 
class Emp
{
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class OOPS6 
{
	public static void main(String[] args) 
	{
		Emp e = new Emp();
		e.setId(100);
		e.setName("Aniket");
		System.out.println(e.getId());
		System.out.println(e.getName());
	}

}
