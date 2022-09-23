package basicConcept;
import java.util.Scanner;
public class Maxi {

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
		if(a>b&&a>c)
		{
			System.out.println("a is the maximum");
			
		}
		else if(b>a&&b>c)
		{
		  System.out.println("b is the maximum");
		  
		}
		else
		{
			System.out.println("c is the maximum");
		}

	}

}
