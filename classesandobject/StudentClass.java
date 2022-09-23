package classesandobject;
import java.util.Scanner;
public class StudentClass {
  String name;
  long phone;
  Address d;
  MyDate a;
  public StudentClass()
  {
	  name="Anu";
	  phone=9876543210l;
	  d=new Address();
	  a=new MyDate();
	  
  }
  public StudentClass(String name,long phone,Address d,MyDate a)
  {
	  this.name=name;
	  this.phone=phone;
	  this.d=d;
	  this.a=a;
  }
  public void display()
  {
	  System.out.println("STUDENT NAME...."+name);
	  System.out.println("PHONE NUMBER...."+phone);
	  d.output();
	  a.display();
  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass ob=new StudentClass();
		ob.display();
		System.out.println("=================================================================");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student name......");
		String name=sc.nextLine();
		System.out.println("Enter the phone number....");
		long phone=sc.nextLong();
		System.out.println("Enter the date of birth....");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yyyy=sc.nextInt();
		System.out.println("Enter the addressLine....");
		String addLine=sc.nextLine();
		sc.next();
		System.out.println("Enter the street...");
		String street=sc.nextLine();
		sc.next();
		System.out.println("Enter the city name..");
		String city=sc.nextLine();
		sc.next();
		System.out.println("Enter the pincode...");
		long pincode=sc.nextLong();
		System.out.println();
		StudentClass ob1=new StudentClass(name,phone,new Address(addLine,street,city,pincode),new MyDate(dd,mm,yyyy));
		ob1.display();

	}

}
