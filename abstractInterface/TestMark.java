package abstractInterface;
import java.util.Scanner;
 abstract class Mark {

	public abstract  void getPercentage();

	
	}
class StudentA extends Mark{
	float m1,m2,m3,percent;
	StudentA(float m1,float  m2,float m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		}

	@Override
	public void getPercentage() {
		// TODO Auto-generated method stub
		percent=(m1+m2+m3)/3;
		System.out.println("Percentage of Student A :"+percent);
		
	}
	
}
class StudentB extends Mark{
	float m1,m2,m3,m4,percent;
	StudentB(float m1,float m2,float  m3,float m4 )
	{

		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
	}

	@Override
	public void getPercentage() {
		// TODO Auto-generated method stub
		percent=(m1+m2+m3+m4)/4;
		System.out.println("Percentage of Student B :"+percent);
		
	}
	
}
public class TestMark {
	public static void main(String h[]) {
		Scanner sc=new Scanner(System.in);
		float tam,eng,mat,sci;
		Mark a,b;
		System.out.println("Enter the marks of Student A ....");
		System.out.print("Tamil Mark :");
		tam=sc.nextFloat();
		System.out.print("English Mark :");
		 eng=sc.nextFloat();
		System.out.print("Maths Mark :");
		 mat=sc.nextFloat();
		a=new StudentA(tam,eng,mat);
		a.getPercentage();
		System.out.println("====================================================");
		System.out.println("Enter the marks of Student b....");
		System.out.print("Tamil Mark :");
		 tam=sc.nextFloat();
		System.out.print("English Mark :");
		 eng=sc.nextFloat();
		System.out.print("Maths Mark :");
		 mat=sc.nextFloat();
		 System.out.print("Science Marks :");
		 sci=sc.nextFloat();
		b=new StudentB(tam,eng,mat,sci);
		b.getPercentage();
		
		
		
	}
}