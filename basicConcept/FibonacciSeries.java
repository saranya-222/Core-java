package basicConcept;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0,f2=1,f3,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		n=sc.nextInt();
		System.out.println("Fibonacci series are...");
		System.out.println(f1+"\n" + f2 );
		for(int i=0;i<n;i++)
		{
			f3=f1+f2;
			System.out.println(f3 );
			f1=f2;
			f2=f3;
			
			
			
			
		}
		
		

	}

}
