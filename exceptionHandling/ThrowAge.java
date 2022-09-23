package exceptionHandling;
import java.util.Scanner;
public class ThrowAge {
	public void calc(int age)
	{
		if(age>=18)
			System.out.println("Eligible to vote");
		else throw new ArithmeticException("Ineligible to vote");
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowAge ob=new ThrowAge();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age..");
		int age=sc.nextInt();
		try
		{
		ob.calc(age);
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		System.out.println("rest of the code");
		}
		

	}


