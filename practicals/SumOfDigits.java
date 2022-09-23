package practicals;
import java.util.Scanner;
public class SumOfDigits {
	int sum,r,t=0;
	public int countDigits(int n)
	{
		if(n<0)
		{
		 t=-1;	
		}
		else
		{
		while(n>0)
		{
			
			r=n%10;
			n=n/10;
			t++;
		}
		}
		return t;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the required number...");
		n=sc.nextInt();
		SumOfDigits ob=new SumOfDigits();
		int t=ob.countDigits(n);
		if(t<0)
		{
			System.out.println("Invalid input");
		}
		else
		{
			System.out.println("SMS sent...");
			System.out.println(t);
		}
		

	}

}
