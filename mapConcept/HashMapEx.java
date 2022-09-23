package mapConcept;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("implementing the hashmap.............");
		Map<Integer, String> h=new HashMap<Integer, String>();
		 h.put(1, "Raghu");
		 h.put(2, "Ram");
		 h.put(3, "Ravi");
		 h.put(8, "Anu");
		 h.put(5, "Ammu");
		 h.put(10, "Guru");//arrange ascendingly according to the keys
		 
		for(Map.Entry<Integer, String> i:h.entrySet())//Map.entry is an interface
			
		{
		   System.out.println("key :"+i.getKey()+"\t Key value :" +i.getValue()); 	
		}
		System.out.println();
		System.out.println(h.get(3));
		System.out.println("\n\nInmplementing the tree map....");
		TreeMap<String, String> t=new TreeMap<String, String>();
		t.put("Z12", "Cofee");
		t.put("A32", "Tea");
		t.put("Y25", "Milk");
		t.put("r67", "RoseMilk");
		t.put("h78", "Baasandi");//arranges according to the keys
		for (Map.Entry<String, String> e:t.entrySet()) {
			System.out.println("Keys :"+e.getKey()+"\tKeyValues :"+e.getValue());
			
		}
		System.out.println("\nImplementing the hashtable....");
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(45, "India");
		ht.put(98, "Germany");
		ht.put(34,"Australia");
		ht.put(90,"China");
		ht.put(78,"WestIndies");//arranges according to the hash code generated.
		for (Map.Entry<Integer, String> p:ht.entrySet()) {
			System.out.println("Keys :"+p.getKey()+"\tKeyValues :"+p.getValue());
			
		}
	
	}

}
