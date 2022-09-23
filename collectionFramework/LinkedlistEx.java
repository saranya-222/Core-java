package collectionFramework;

import java.util.LinkedList;

public class LinkedlistEx {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("ragu");
		l.add("anu");
		l.add(null);
		l.add("ram");
		l.add("helan");
		l.add(4,"reema");
		for (String string : l) {
          System.out.println(string);			
		}

	}

}
