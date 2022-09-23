package objectConcept;
import java.util.Scanner;
public class Student  implements Cloneable{
     int id,age;
     String name;
     
	public Student(int id,int age,String name ) {
		super();
		// TODO Auto-generated constructor stub
		this.id=id;
		this.age=age;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		int id,age;
		String name;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details...");
		System.out.print("Student id :");
         id=sc.nextInt();
         System.out.print("Age :");
         age=sc.nextInt();
         System.out.print("Name :");
         name=sc.next();
		Student s1=new Student(id,age,name);
		System.out.println(s1);
		System.out.println("Enter the details...");
		System.out.print("Student id :");
	
         id=sc.nextInt();
         System.out.print("Age :");
         age=sc.nextInt();
         System.out.print("Name :");
         name=sc.next();
         Student s2=new Student(id,age,name);
         System.out.println(s2);
         System.out.println("Class Name :"+s2.getClass().getName());

         Student s3=(Student) s2.clone();
        
	}

}
