package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class AgeCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add( new Employee(101,"Anu",24));
		l.add( new Employee(102,"Aravind",21));
		l.add( new Employee(103,"Arun",26));
		l.add( new Employee(104,"Arul",18));
		Collections.sort(l);
		for (Employee employee : l) {
              System.out.println(employee);			
		}
		System.out.println();
		System.out.println("Descending order");
		Collections.reverse(l);
		for (Employee employee : l) {
            System.out.println(employee);			
		}

	}

}
