package collectionFramework;

public class Stu {

int id;
String name;
int age;
public Stu(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "Stu [id=" + id + ", name=" + name + ", age=" + age + "]";
}


}
