package com;

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
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
}

public class demo2 {

	public static void main(String[] args) {
		Emp e = new Emp();
		e.setId(101);
		e.setName("Aniket");
		System.out.println(e);

	}

}
