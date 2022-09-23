package junitConcept;

import java.util.Scanner;

public class SalesPerson {
	int n,salary,commission;
	double f_salary;
	
	

	public int getCommission() {
		return commission;
	}



	public void setCommission(int commission) {
		this.commission = commission;
	}



	public long commission()
	{
		if(commission>=90)
		{
		    f_salary= getSalary()+(0.20*salary);
		}
		else if(commission>=80&&commission<90) 
		{
			 f_salary=salary+ (0.10*salary);
		}
		
		else if(commission>=70&&commission<80)
		{
			 f_salary=salary+ (0.05*salary);
		}
		else if(commission<70)
		{
			f_salary=salary;
		}
		return(long) f_salary;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}
}
