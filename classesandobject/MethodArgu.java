package classesandobject;
import java.util.Scanner;
public class MethodArgu {
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition="+c);
	}
	public int sub(int a,int b)
	{
		int c=a-b;
		return(c);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodArgu ar=new MethodArgu ();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value a");
		int a=sc.nextInt();
		System.out.println("Enter the value a");
		int b=sc.nextInt();
		ar.add(a,b);
		
		int h=ar.sub( a,b);
		System.out.println("Subtraction="+h);
	}

}
