package collectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<String>();
		v.addElement("Arun");
		v.addElement("Ajay");
		v.addElement("Anu");
		v.addElement("Banu");
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		

	}

}
