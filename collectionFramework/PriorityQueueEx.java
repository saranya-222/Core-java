package collectionFramework;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.add("Mango");
		q.add("Apple");
		q.add("orange");
		q.offer("Custard Apple");
		q.offer("jackFruit");
		q.offer("WaterMelon");
		System.out.println("implementing PrioriyQueue....");
		for (String string : q) {
			System.out.println(string);
		}
		System.out.println();
		System.out.println("Printing the head of the queue....");
		System.out.println(q.element());
		System.out.println();
		System.out.println("removing the elements..."+q.remove());
		
		for (String string : q) {
			System.out.println(string);
		}
		System.out.println();
		System.out.println("remove the head..."+q.poll());
        
        for (String string : q) {
			System.out.println(string);
		}

	}

}
