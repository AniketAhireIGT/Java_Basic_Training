package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo3 {

	public static void main(String[] args) throws FileNotFoundException
	{
		m1();
	}
	
	static void m1() throws FileNotFoundException
	{
		m2();
		System.out.println("M1 method.....");
	}
	static void m2() throws FileNotFoundException
	{
		m3();
		System.out.println("M1 method.....");
	}
	static void m3() throws FileNotFoundException
	{
		File f = new File("Aniket.txt");
		FileReader fr = new FileReader(f);
	}

}
