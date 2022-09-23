package classesandobject;

import java.util.Scanner;

public class SalesPerson extends ExEmployee {
	int sales;
	double commission;
	double final_salary;
	SalesPerson()
	{
		super();
		
	}
   SalesPerson(int id,String name,MyDate d,int days,float amount,int sales)
   {
	  super(id,name,d,days,amount);
	  this.sales=sales;
	  
   }
   public void calculate()
   {
        super.calculate();
	   if(sales>=95)
	   {
		   commission=(0.2*salary);
	   }
	   else if(sales>=90&&sales<95)
	   {
		   commission=(0.15*salary);
	   }
	   else if(sales>=80&&sales<90)
	   {
		   commission=(0.1*salary);
	   }
	  
	   else if(sales>=75&&sales<80)
	   {
		   commission=(0.05*salary);
	   }
	   else
	   {
		   commission=0;
	   }
	 final_salary=salary+commission;  
   }
   public void display()
   {
	   super.display();
	   System.out.println("Commission amount :"+commission);
	   System.out.println("Final_Salary :"+final_salary);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sales person name....");
		String name=sc.nextLine();
		System.out.println("Enter the id....");
		int id=sc.nextInt();
		System.out.println("Enter the date of birth...");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yyyy=sc.nextInt();
		System.out.println("No of working days.....");
		int n=sc.nextInt();
		System.out.println("Salary of the person....");
		float salary=sc.nextFloat();
		System.out.println("Enter the sales percentage....");
		int sales=sc.nextInt();
		SalesPerson ob=new SalesPerson(id,name,new MyDate(dd,mm,yyyy),n,salary,sales);
		ob.calculate();
		ob.display();

	}

}
