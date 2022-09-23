package classesandobject;
import java.util.Scanner;
public class ExStatic {
	int id;
	String name;
	static String clgname="DR.MGR University  ";
	
		
	public ExStatic(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void display()
	{
		System.out.println("Student name :"+name);
		System.out.println("Student Id :"+id);
		System.out.println("College name :"+clgname);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student name...");
		String name=sc.nextLine();
		System.out.println("Enter the student id....");
		int id=sc.nextInt();
		ExStatic ob=new ExStatic(id,name);
		ob.display();
		
		System.out.println("=============================");
		System.out.println("Enter the student name...");
		sc.nextLine();
		String s_name=sc.nextLine();
		System.out.println("Enter the student id....");
		int s_id=sc.nextInt();
		ExStatic ob1 =new ExStatic(s_id,s_name);
		ob1.display();
		// TODO Auto-generated method stub

	}

}
