package classesandobject;
import java.util.Scanner;
public class GetStatic {
	 static String clgname;
	public static void add(int a,int b)
	{
		System.out.println("Added="+(a+b));
	}
	static
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the clg name");
		clgname=sc.nextLine();
		System.out.println(clgname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
      GetStatic .add(a,b);
	}

}
