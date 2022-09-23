package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Stu> s=new ArrayList<Stu>();
	     s.add(new Stu(101,"Ajay",34));
	     s.add(new Stu(102,"Arun",36));
	     s.add(new Stu(103,"Abhi",45));
	     s.add(new Stu(104,"barani",12));
	     System.out.println("Comparing on the basis of age....");
	     Collections.sort(s,new AgeComparator());
	     for (Stu stu : s) {
			System.out.println(stu);
		}
	     System.out.println();
	     System.out.println("Comparing on the basis of name");
	        Collections.sort(s,new NameComparator());
	        for (Stu stu : s) {
				System.out.println(stu);
			}
	}

}
