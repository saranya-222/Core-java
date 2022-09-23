package practicals;

import java.util.ArrayList;

public class Dummy {
	static String name1="saran";
	String name2="saran2";
	String name3="saran3";
	String name4="saran4";
	String name5="saran5";
    
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<String>list2=new ArrayList<String>();
		list.add(name1);
		list.add(name1);
		list.add(name1);
		list.add(name1);
		list.add(name1);
		list2.addAll(list);
		for (String string : list2) {
			System.out.println(list2);
		}
	}

}
