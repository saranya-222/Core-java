package java8feturesconcept;

import java.util.ArrayList;

public class ForEachMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("Babu");
		a.add("Amudha");
		a.add("Saranya");
		a.add("Gokul");
		a.forEach(str->System.out.println(str));

	}

}
