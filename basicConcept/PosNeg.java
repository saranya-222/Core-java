package basicConcept;
import java.util.Scanner;
public class PosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a");
		a=sc.nextInt();
		System.out.println("Enter the b");
		b=sc.nextInt();
		System.out.println("Enter the c");
		c=sc.nextInt();
			if(a>0)
		  {
		  System.out.println("a is positive");
		  }
		else if(a<0)
		{
			System.out.println("a is negative");
		}
		else 
		{
			System.out.println("a is Zero");
		}	
		if(b>0)
			{
				System.out.println("b is positive");
			}
			else if(b<0)
			{
				System.out.println("b is negative");
			}
			else 
			{
				System.out.println("b is Zero");
			}
		 
		
			if(c>0)
			{
				System.out.println("c is positive");
			}
			else if(c<0)
			{
				System.out.println("c is negative");
			}
			else 
			{
				System.out.println("c is  Zero");
			}
		}


}
