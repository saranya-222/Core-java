package classesandobject;
import java.util.Scanner;
public class Person {
long id;
String name;
MyDate d;

	public Person()
	{
		id=193700;
		name="SARANYA";
		d=new MyDate();
		
		
	}
	public Person(long id,String name,MyDate d)
	{
		this.id=id;
		this.name=name;
		this.d=d;
	}
	public void display()
	{
		System.out.println("Person id..."+id);
		System.out.println("Person name..."+name);
		d.display();
	}
	public static void main(String h[])
	{
		Person p=new Person();
		p.display();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the person id...");
		long id=sc.nextInt();
		System.out.println("Enter the name....");
		String name=sc.nextLine();
		sc.next();
		System.out.println("Enter the date of bith....");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yyyy=sc.nextInt();
		Person p1=new Person(id,name,new MyDate(dd,mm,yyyy));
		p1.display();
	}

}
