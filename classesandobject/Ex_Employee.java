package classesandobject;
import java.util.Scanner;
public class Ex_Employee {
  String emp_name;
  long emp_id;
  double basic_salary,allowance,gross_salary,tax,net_salary;
  Scanner sc=new Scanner(System.in);
  Ex_Employee()
  {
	  emp_name="";
	  emp_id=0;
	  basic_salary=0;
	  allowance=0;
	  gross_salary=0;
	  tax=0;
	  net_salary=0;
	  
  }
  public void accept()
  {
	  System.out.println("Enter the employee name...");
	  emp_name=sc.nextLine();
	  System.out.println("Enter the employee id...");
	  emp_id=sc.nextLong();
	  System.out.println("Enter the basic salary...");
	  basic_salary=sc.nextDouble();
  }
  public void allow()
  {
	  allowance=0.55*basic_salary;
  }
  public void gross()
  {
     gross_salary=allowance+basic_salary;
  }
  public void tax()
  {
	  tax=0.12*gross_salary;
  }
  public void net()
  {
	  net_salary=gross_salary-tax;
  }
  public void display()
  {
	  System.out.println("EMPLOYEE CODE...."+emp_id);
	  System.out.println("EMPLOYEE NAME...."+emp_name);
	  System.out.println("BASIC SALARY...."+basic_salary);
	  System.out.println("TAX AMOUNT...."+tax);
	  System.out.println("NET SALARY...."+net_salary);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex_Employee ob=new Ex_Employee();
		ob.accept();
		ob.allow();
		ob.gross();
		ob.tax();
		ob.net();
		ob.display();
		

	}

}
