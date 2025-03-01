package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List l = new List();
						//Duplicate are allowed
		//ArrayList al = new ArrayList();  //best to search operation
		//LinkedList al = new LinkedList();  //best for insert and delete
		
		//Legacy class : old Classs : 1995 :in this we have less methods
		//Vector al = new Vector();
		//Stack al = new Stack();
		
		//Set s = new Set();
		//HashSet al = new HashSet(); //no duplicate + no order
		//LinkedHashSet al = new LinkedHashSet(); //no duplicate + user entered order
		TreeSet al = new TreeSet(); //no duplicate +sorted order
		
		al.add(100);
		al.add(345);
		al.add(234);
		al.add(5656);
		al.add(76);
		al.add(345);
		
		System.out.println("=================ITERATOR============");
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("===========================================");
		HashMap map = new HashMap();
		//LinkedHashMap map = new LinkedHashMap();
		//TreeMap map = new TreeMap();
		
		map.put(111, "Aniket");
		map.put(456, "Abhi");
		map.put(453, "Manish");
		map.put(789,"Ganu");
		map.put("ABC", "ISHA");
		map.put("XYZ", "ISHA");
		
		Set s = map.entrySet();
		
		Iterator i1 = s.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
	}

}
