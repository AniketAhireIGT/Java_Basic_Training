//***********************************ArrayList**************************************
package Collections;
import java.util.*;

class clear
{
	
}

public class Demo2 {

	public static void main(String[] args) 
	{	
		ArrayList al = new ArrayList();
		al.add(122);
		al.add(45.45);
		al.add("Aniket");
		al.add(true);
		al.add("A");
		al.add(46);
		al.add(new Date());
		al.add(new clear());
		al.add(23456);
		System.out.println(al);
		System.out.println("============================");
		for(int i=0 ; i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("==================Iterator============");
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		//forward direction
		//reverse direction
		//delete the record while iterating
		//add
	}

}
