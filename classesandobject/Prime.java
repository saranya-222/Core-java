package classesandobject;
import java.util.Scanner;
public class Prime {
    int n,f=0;
    Scanner s=new Scanner(System.in);
    public void calledInput()
    {
    	System.out.println("Enter the number...");
    	n=s.nextInt();
    }
    public void calledPrime()
    {
    	if(n==0||n==1)
    	{
    		System.out.println("The given number is not a prime number....");
    	}
    		else
    		{
    			for(int i=2;i<=n/2;i++) 
    			{
    				if(n%i==0)
    				{
    				System.out.println("The given number is not a prime number...");
    				f=1;
    				
    				}
    		}
    	}
    	if(f==0)
    	{
    		System.out.println("The given number is a prime number....");
    	}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime ob=new Prime();
		ob.calledInput();
		ob.calledPrime();

	}

}
