package classesandobject;
import java.util.Scanner;
public class Test extends ExEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExEmployee ob=new ExEmployee();
		ob.calculate();
		ob.display();
		System.out.println("===============================================");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee name :");
		String name=sc.nextLine();
		System.out.println("Enter the date of birth :");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yyyy=sc.nextInt();
		System.out.println("Enter the employee id :");
		int id=sc.nextInt();
		System.out.println("Enter the number of working days :");
		int days=sc.nextInt();
		System.out.println("Enter the amount per day...");
		float amount=sc.nextFloat();
		ExEmployee ob1=new ExEmployee(id,name,new MyDate(dd,mm,yyyy),days,amount);
		ob1.calculate();
		ob1.display();
		

	}

}
