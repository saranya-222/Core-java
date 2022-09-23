package collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> d=new ArrayDeque<String>();
		d.add("Tomato");
		d.add("onion");
		d.offer("brinjal");
		d.offer("cucumber");
		d.offerFirst("Carrot");
		d.offerLast("Beetroot");
		d.add("ginger");
		System.out.println("implementing Deque Array....");
		for (String string : d) {
			System.out.println(string);
		}
    System.out.println("\nremoving the  first element...."+d.pollFirst());
    for (String string : d) {
		System.out.println(string);
	}
    System.out.println("\n removing the last element...."+d.pollLast());
    for (String string : d) {
		System.out.println(string);
	}
    System.out.println("\n removing using remove()...."+d.remove());
    for (String string : d) {
		System.out.println(string);
	}
	}

}
