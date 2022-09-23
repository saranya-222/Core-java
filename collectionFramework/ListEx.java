package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l=new ArrayList();
		l.add("arun");
		l.add(90);
		l.add(78.99);
		l.add("aruna");
		ListIterator i=l.listIterator();
		
		
		System.out.println("Forward direction");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("Backward direction");
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}

	}

}
