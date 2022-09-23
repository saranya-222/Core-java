package classesandobject;
import java.util.Scanner;
public class RectConstructor {
	double l,b;
	RectConstructor()
	{
		l=10;
		b=11;
	}
	RectConstructor(double l,double b)
	{
		l=l;
		b=b;
	}
	public void output()
	{
		System.out.println("Area of a rectangle..."+(l*b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		RectConstructor r=new RectConstructor();
		r.output();
		System.out.println("Enter the length and breadth... ");
		double le=sc.nextDouble();
		double br=sc.nextDouble();
		RectConstructor r1=new RectConstructor(le,br);
		r1.output();
	}
}
