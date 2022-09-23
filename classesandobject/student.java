package classesandobject;

import java.util.Scanner;

public class student {
	long stu_id;
	double m1,m2,m3,tot,per;
	String name;
  student()
  {
	  stu_id=1944;
	  m1=99;
	  m2=45;
	  m3=68;
	  name="Anu";
  }
  student(long stu_id, double m1,double m2,double m3,String name)
  {
	  this.stu_id=stu_id;
	  this.m1=m1;
	  this.m2=m2;
	  this.m3=m3;
	  this.name=name;
  }
  public void calculate()
  {
	  tot=m1+m2+m3;
	  per=tot/3;
	  System.out.println("Student name...."+name);
	  System.out.println("student id..."+stu_id);
	  System.out.println("Total marks of the student ...."+tot);
	  System.out.println("Percentage of the student...."+per+"%");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		student ob=new student();
		ob.calculate();
		String name;
		System.out.println("Enter the student name...");
		name=sc.nextLine();
		System.out.println("Enter the student id...");
		long id=sc.nextLong();
		System.out.println("Enter the first mark...");
		double m1=sc.nextInt();
		System.out.println("Enter the second mark....");
		double m2=sc.nextDouble();
		System.out.println("Enter the third mark....");
		double m3=sc.nextDouble();
		student ob1=new student(id,m1,m2,m3,name);
		ob1.calculate();
		
		


	

	}

}
