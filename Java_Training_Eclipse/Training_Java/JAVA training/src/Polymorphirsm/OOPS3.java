package Polymorphirsm;

class Animal
{
	public void makesound()
	{
		System.out.println("Animal Makes a sound");
	}
}

class Dog extends Animal
{
	public void makesound()
	{
		System.out.println("Dog Barks.......!");
	}
}

class Cat extends Animal
{
	public void makesound()
	{
		System.out.println("Cat meows.....!");
	}
}

public class OOPS3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Dog d = new Dog();
		dog.makesound();
		
	}

}
