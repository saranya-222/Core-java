package classesandobject;
import java.util.Scanner;
public class StudentDet extends Person {
	int tam,eng,mat;
	float tot,percent;
	StudentDet()
	{
		super();
		tam=90;
		eng=98;
		mat=99;
		
	}
	StudentDet(long id,String name,MyDate d,int tam,int eng,int mat)
	{
		super(id,name,d);
		this.tam=tam;
		this.eng=eng;
		this.mat=mat;
	}
	public void calculate()
	{
		tot=tam+eng+mat;
		percent=tot/3;
	}
	public void display()
	{
		super.display();
		System.out.println("Total marks :"+tot);
		System.out.println("Percentage :"+percent);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDet ob=new StudentDet();
		ob.calculate();
		ob.display();
		System.out.println("================================================");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student name .....");
		String name=sc.nextLine();
		System.out.println("Enter the student id .....");
		long id=sc.nextLong();
		System.out.println("Enter the date of birth...");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yyyy=sc.nextInt();
		System.out.println("Enter the marks....");
		System.out.println("Tamil :");
		int tam=sc.nextInt();
		System.out.println("English :");
		int eng=sc.nextInt();
		System.out.println("Maths :");
		int mat=sc.nextInt();
		StudentDet ob1=new StudentDet(id,name,new MyDate(dd,mm,yyyy),tam,eng,mat);
		ob1.calculate();
		ob1.display();
		

	}

}
