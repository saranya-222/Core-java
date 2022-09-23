package classesandobject;
import java.util.Scanner;
public class AreaArgu {
	
	public void cir(double r)
	{
	  System.out.println("Area of a circle..."+(3.14*r*r));	
	}
	public void rect(double l,double b)
	{
		System.out.println("Area of a rectangle..."+(l*b));
	}
	public double tri(double b,double h)
	{
		double a=0.5*b*h;
		return(a);
		
	}
	public int sqr(int a)
	{
		int g=a*a;
		return(g);
	}
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	AreaArgu ar=new AreaArgu();
	System.out.println("Enter the radius of the circle...");
	double r=sc.nextDouble();
	System.out.println("Enter the length of the rectangle");
	double l=sc.nextDouble();
	System.out.println("Enter the breadth of the rectangle");
	double b=sc.nextDouble();
	System.out.println("Enter the base of the triangle");
	double ba=sc.nextDouble();
	System.out.println("Enter the height of the triangle");
	double h=sc.nextDouble();
	System.out.println("Enter the side of the square");
	int s=sc.nextInt();
	ar.cir(r);
	ar.rect(l, b);
	double area_t=ar.tri(ba, h);
	System.out.println("Area of the triangle..."+area_t);
	int area_s=ar.sqr(s);
	System.out.println("Area of the square..."+area_s);	

	}

}
