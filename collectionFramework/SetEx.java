package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new HashSet<String>();
		s.add("Car");
		s.add("Bike");
		s.add("Jet");
		s.add("plane");
		s.add("Bicycle");
		s.add(null);
		System.out.println("Using HashSet class....");
		for (String string : s) {
			System.out.println(string);
		}
		TreeSet<String> t=new TreeSet<String>();
		t.add("pizza");
		t.add("sanwich");
		t.add("panipuri");
		t.add("kachori");
		t.add("panipuri");
		//t.add(null);//if stores null values ,throws null pointer exception.
		t.add("pizza");
		System.out.println();
		System.out.println("implementing treeSet class....");
		Iterator<String> itr=t.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		LinkedHashSet<String> l=new LinkedHashSet<String>();
		  l.add("phone");
		  l.add("laptop");
		  l.add("tab");
		  l.add("Ipad");
		  l.add("Computer System");
		  l.add("Television");
		  System.out.println();
		  System.out.println("Implementing LinkedHashSet....");
			Iterator<String> i=l.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		  
		

	}

}
