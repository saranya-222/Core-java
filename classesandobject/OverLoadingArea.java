package classesandobject;

import java.util.Scanner;

public class OverLoadingArea {

	public void tri(double b,double h)
	{
		double a=0.5*b*h;
		System.out.println("Area of a triangle..."+a);
	}
		public void tri(int  b,int h)
		{
			double a=0.5*b*h;
			System.out.println("Area of a triangle..."+a);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingArea ob=new OverLoadingArea();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  Integer  values...");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the double values...s");
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		ob.tri(a,b);
		ob.tri(c, d);

	}

}
