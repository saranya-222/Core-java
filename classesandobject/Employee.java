package classesandobject;
import java.util.Scanner;
public class Employee {
	long emp_id;
	int n;
	double rate,salary;
	String name;
  Employee()
  {
	  emp_id=1234;
	  n=10;
	  rate=300;
	  name="Arun";
  }
  Employee(long emp_id,int n,double rate,String name)
  {
	  this.emp_id=emp_id;
	  this.n=n;
	  this.rate=rate;
	  this.name=name;
	  
  }
  public void calculate()
  {
	  salary=n*rate;
	  System.out.println("Employee name..."+name);
	  System.out.println("Employee id..."+emp_id);
	  System.out.println("Salary for the employee ...."+salary);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee ob=new Employee();
		ob.calculate();
		System.out.println("Enter the employee name...");
		String name=sc.nextLine();
		System.out.println("Enter the employee id...");
		long id=sc.nextLong();
		System.out.println("Enter the number of days worked...");
		int n=sc.nextInt();
		System.out.println("Enter the amount per day....");
		double rate=sc.nextDouble();
		Employee ob1=new Employee(id,n,rate,name);
		ob1.calculate();
		
		

	}

}
