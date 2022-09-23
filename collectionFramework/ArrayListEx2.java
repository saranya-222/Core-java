package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s=new ArrayList<String>();
		s.add("Babu");
		s.add("Amudha");
		s.add("saranya");
		s.add("Gokul");
		Iterator<String> t=s.iterator();
		System.out.println("Iterating the element using Iterator....");
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
		ArrayList i=new ArrayList();
		i.add("Manjula");
		i.add(89);
		i.add(23.55);
		i.add(false);
		System.out.println("Iterating the elements using for each loop...");
		for (Object ob : i) {
			System.out.println(ob);
			
		}
		ArrayList<String> h=new ArrayList<String>();
		h.add("anu");
		h.add("viji");
		h.add("satya");
		h.add("guru");
		System.out.println("\n Inserting one list from the another");
		s.addAll(h);
		for (String string : s) {
			
			System.out.println(string);
		}
		System.out.println("\n removing elements from 1 list to another... ");
		s.removeAll(h);
for (String string : s) {
			
			System.out.println(string);
		}
		System.out.println("\ngetting an element from the list using index....");
		System.out.println(s.get(2)); //s.get(2);
		System.out.println();
		System.out.println(h.get(0));
		System.out.println();
		System.out.println(i.get(3));

	}

}
