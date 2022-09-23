package collectionFramework;

import java.util.ArrayList;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentList> i=new ArrayList<StudentList>();
		i.add(new StudentList(101,12,"rio"));
		i.add(new StudentList(102,13,"ravi"));
		i.add(new StudentList(103,14,"rambo"));
		i.add(new StudentList(104,15,"ragu"));
		for (StudentList studentList : i) {
			System.out.println(i);
		}

	}

}
