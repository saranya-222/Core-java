package fileHandlingConcept;

import java.io.Serializable;

public class Employee implements Serializable {
	int id;
	String name;
	int age;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

}
