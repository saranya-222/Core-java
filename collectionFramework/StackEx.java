package collectionFramework;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s=new Stack<String>();
		s.push("Ammu");
		s.push("pragathi");
		s.push("ram");
		s.push("guru");
		s.push("vicky");
		System.out.println(s);
		System.out.println();
		System.out.println("Search element :"+s.search("pragathi"));
		System.out.println();
		System.out.println("remove element :"+s.pop());
		System.out.println();
		System.out.println("Search Element :"+s.search("anu"));

	}

}
