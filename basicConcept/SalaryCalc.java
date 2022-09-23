package basicConcept;
import java.util.Scanner;
public class SalaryCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int salary;
       double shift,saved;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the salary...");
       salary=sc.nextInt();
       System.out.println("Enter the no of shifts handled....");
       shift=sc.nextInt();
       if(salary>8000)
       {
    	   System.out.println("Salary is too large....");
       }
       double food=0.20*salary;
       double travel=0.40*salary;
       if(shift>0)
       {
    	   double temp=0.02*salary;
    	   saved=salary-(food+travel+temp);
    	   System.out.println("The amount which kiran saved is...."+saved);
       }
       else
       {
    	   saved=salary-(food+travel);
    	   System.out.println("The amount which kiran saved is...."+saved);
    	   System.out.println("Shift is too small...");
       }
       
	}

}
