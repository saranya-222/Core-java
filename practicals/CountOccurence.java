package practicals;
import java.util.Scanner;
public class CountOccurence {

	public static void main(String[] args) {
 		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int count=0;
    System.out.println("Enter the number...");
    int n=sc.nextInt();
   
    if(n<0)
    {
    	System.out.println("Number too small....");
    	System.exit(0);
    }
    else  if(n>32767)
    {
    	System.out.println("Number too large...");
    	System.exit(0);
    }
    else
    {
    	 System.out.println("Enter the number to check is occurrences...");
    	    int d=sc.nextInt();
    	while(n>0)
    	{
    		int r=n%10;
    		if(d==r)
    		{
    			count++;
    		}
    		n/=10;
    	}
    }
    System.out.println("Number of times occurrs :"+count);
	}

}
