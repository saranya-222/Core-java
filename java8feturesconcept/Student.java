package java8feturesconcept;

import java.util.ArrayList;
import java.util.List;

public class Student {
  int id,age;
  String name;
public Student(int id, int age, String name) {
	super();
	this.id = id;
	this.age = age;
	this.name = name;
}
public int getId() {
	return id;
}

public int getAge() {
	return age;
}

public String getName() {
	return name;
}
public static List<String>  getList()
{
	List<String> l=new ArrayList<String>();
	l.addAll(new ArrayList());
	return getList();
}
  

}
