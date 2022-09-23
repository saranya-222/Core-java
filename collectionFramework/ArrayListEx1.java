package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l=new ArrayList();
		l.add(1);
		l.add("babu");
		l.add("Amudha");
		l.add("gokul");
		Iterator t=l.iterator();
		System.out.println("Non Generic....\n");
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
		System.out.println();
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mohan");
		list.add("Naren");
		list.add("Manjula");
		list.add("Balu");
		Iterator<String> t1=list.iterator();
		System.out.println("Generic..\n");
		
		while(t1.hasNext())
		{
			System.out.println(t1.next());
		}
		

	}

}
