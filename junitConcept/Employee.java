package junitConcept;

import java.util.Scanner;

public class Employee {
	  long salary;
	 long y_salary,appraisal=0;
   public long getSalary() {
	   
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
public long yearlySalary()
   {
	 
	  
	   y_salary=12*getSalary();
	 	   return( y_salary);
	   
   }


public long calculateAppraisal()
{
	
	if(getSalary()>=30000)
	{
	    appraisal=+yearlySalary()+2000;
	}
	
	else if(getSalary()<30000)
	{
		appraisal=y_salary+1000;
	}
	return(long) appraisal;

}
}
