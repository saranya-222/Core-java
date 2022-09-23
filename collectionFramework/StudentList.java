package collectionFramework;

public class StudentList {
	int id,age;
	String name;
	public StudentList(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentList [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	

}
