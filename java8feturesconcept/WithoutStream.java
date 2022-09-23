package java8feturesconcept;

import java.util.ArrayList;

public class WithoutStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l=new ArrayList<String>();
		l.add("Ravi");
		l.add("Raghu");
		l.add("ammu");
		l.add("Hemanth");
		l.add("Revanth");
		int count=0;
		for (String string : l) {//Sequential checking process
			if(string.length()<5)
			{
				count++;
			}
			
			
		}
		System.out.println(" number of String less than 5 :"+count);
	}

}
