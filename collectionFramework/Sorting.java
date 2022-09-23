package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l=new ArrayList<String>();
		l.add("arun");
		l.add("ram");
		l.add("anu");
		l.add("guru");
		l.add("mano");
		Collections.sort(l);
		for (String string : l) {
			System.out.println(string);
			
		}

	
	ArrayList<Integer> l1= new ArrayList<Integer>();
	l1.add(67);
	l1.add(9);
	l1.add(4);
	Collections.sort(l1);
	for (Object object : l1) {
		System.out.println(object);
		
	}
	
	}
}
