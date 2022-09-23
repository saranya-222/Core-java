package classesandobject;
import java.util.Scanner;
public class EmployeeClass {
	int emp_id;
	String emp_name;
	MyDate d;
	Address a;
	public EmployeeClass()
	{
		emp_id=12345;
		emp_name="Arun";
		d=new MyDate();
		a=new Address();
	}
	public EmployeeClass(int emp_id,String emp_name, MyDate d,Address a)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.d=d;
		this.a=a;
	}
	public void display()
	{
		System.out.println("EMPLOYEE ID......"+emp_id);
		System.out.println("EMPLOYEE NAME...."+emp_name);
		d.display();
		a.output();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeClass ob=new EmployeeClass();
		ob.display();
		System.out.println("======================================================");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employeee name...");
		String name=sc.nextLine();
		
		System.out.println("Enter the employee id....");
		int id=sc.nextInt();
		System.out.println("Enter the date of birth...");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yyyy=sc.nextInt();
		System.out.println("Enter the address line...");
		sc.nextLine();
		String addLine=sc.nextLine();
		
		System.out.println("Enter the street info...");
		String street=sc.nextLine();
		//sc.next();
		System.out.println("Enter the city....");
		String city=sc.nextLine();
		//sc.next();
		System.out.println("Enter the pincode");
		long pincode=sc.nextLong();
		EmployeeClass ob1=new EmployeeClass(id,name,new MyDate(dd,mm,yyyy),new Address(addLine,street,city,pincode));
		ob1.display();

	}

}
