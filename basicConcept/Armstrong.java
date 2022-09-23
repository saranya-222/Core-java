package basicConcept;
import java.io.*;
public class Armstrong {

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		int n,sum=0,r;
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number...");
		n=Integer.parseInt(b.readLine());
		int f=n;
		while(f>0)
		{
			r=f%10;
			sum=sum+r*r*r;
			f=f/10;
		}
		if(sum==n)
		{
			System.out.println("Armstrong number...");
		}
		else
		{
			System.out.println("Not an armstrong number...");
		}

	}

}
