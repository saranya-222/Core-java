package classesandobject;
import java.util.Scanner;
public class ArithmeticArgu {
	public double add(double a,double b)
	{
			return(a+b);
	}
	public int sub(double a,double b)
	{
		
           return(int)(a-b);
	}
	public void multiple(double a,double b)
	{
		
		System.out.println("multiplication="+(a*b));
		
	}
	public void divide(double a,double b)
	{
		
		System.out.println("Division="+(a/b));
	
	}
	
	public void modulus(double a,double b)
	{
	
		System.out.println("modulus="+(a%b));
	
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArithmeticArgu ob=new ArithmeticArgu();
		System.out.println("Enter the value of a...");
		double a=sc.nextDouble();
		System.out.println("Enter the value of b...");
		double b=sc.nextDouble();
		double add=ob.add(a, b);
		System.out.println("Addition="+add);
		int sub=ob.sub(a, b);
		System.out.println("Subtraction="+sub);
       ob.multiple(a,b);
       ob.divide(a, b);
       ob.modulus(a, b);

	}

}
