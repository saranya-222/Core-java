package classesandobject;
import java.util.Scanner;

public class JimSalaryPrac {
	 float gross_salary=0;
	 int n;
	public float calculateGross(double b_salary, int days)
	{
		gross_salary=(float) ((0.5*b_salary)+(0.75*b_salary));
		if(n==31)
		{
			gross_salary=gross_salary+500f;
		}
		return gross_salary;
		
	}

	public static void main(String[] args) {
	 	// TODO Auto-generated method stub
          double b_salary;
          int days;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter te basic salary of the Jim....");
          b_salary=sc.nextDouble();
          System.out.println("Enter the number of days worked...");
          days=sc.nextInt();
          if(b_salary>1000&&days>31)
          {
        	  System.out.println("Invalid input");
        	  System.exit(0);
          }
          else if(b_salary<0&&days==0)
          {
        	  System.out.println("Invalid input");
        	  System.exit(0);
          }
          JimSalaryPrac ob=new JimSalaryPrac();
       float g_salary=ob.calculateGross(b_salary,days);
       System.out.println("The Gross salary of the Jim :"+g_salary);
       
	}

}
