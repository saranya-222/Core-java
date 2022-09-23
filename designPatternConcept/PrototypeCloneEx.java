package designPatternConcept;

import java.util.Scanner;

class Employee 
{
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	/*@Override
	public void getClone() {
		// TODO Auto-generated method stub
		return;
	}*/
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public Employee getClone() {
		// TODO Auto-generated method stub
		return null;
	}
}
public class PrototypeCloneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the employee id...");
     int id=sc.nextInt();
     System.out.println("Enter the name...");
     String name=sc.next();
     System.out.println("Enter the slary amount....");
     double salary=sc.nextDouble();
     Employee e1=new Employee(id,name,salary);
     System.out.println(e1);
    Employee e2=(Employee)e1.getClone();
    System.out.println(e2);
     
	}

}
