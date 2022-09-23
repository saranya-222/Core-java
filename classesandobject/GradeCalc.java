package classesandobject;

import java.util.Scanner;

public class GradeCalc extends StudentDet {
	String grade;
   /*GradeCalc()
   {
	   super();
	 
   }*/
   GradeCalc(long id,String name,MyDate d,int tam,int eng,int mat) 
   {
	   super(id,name,d,tam,eng,mat);
   }
   public void calculate()
   {
	   super.calculate();
	   if(percent>90)
	   {
		   grade="H";
	   }
	   else if(percent>80)
	   {
		   grade="S";
	   }
	   else if(percent>70)
	   {
		   grade="A";
	   }
	   else if(percent>60)
	   {
		   grade="B";
	   }
	   else if(percent>50)
	   {
		   grade="c";
		   
	   }
	   else if(percent<50)
	   {
		   grade="fail";
	   }
	  
   }
   public void display()
   {
	   super.display();
	   System.out.println("Grade :"+grade);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student name....");
		String name=sc.nextLine();
		System.out.println("Enter the id....");
		long id=sc.nextLong();
		System.out.println("Enter the date of birth....");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yyyy=sc.nextInt();
		System.out.println("Enter the tamil marks.....");
		int tam=sc.nextInt();
		System.out.println("Enter the english marks.....");
		int eng=sc.nextInt();
		System.out.println("Enter the maths marks.....");
		int mat=sc.nextInt();
		
		GradeCalc ob=new GradeCalc(id,name,new MyDate(dd,mm,yyyy),tam,eng,mat);
		ob.calculate();
		ob.display();

	}

}
