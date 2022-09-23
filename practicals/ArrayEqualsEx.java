package practicals;
import java.util.Scanner;
public class ArrayEqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int flag=0;
    System.out.println("Enter the size of the array..");
    int n=sc.nextInt();
    if(n%2==0)
    {
    	System.out.println("given size is not accepted");
    	System.exit(0);
    
    }
    else if(n<0)
    {
    	System.out.println("Invalid Array size..");
    	System.exit(0);
    }
    else
    {
    	int a[]=new int[n];
    	System.out.println("Enter the  array elements.... ");
    	for(int i=0;i<a.length;i++)
    	{
    		a[i]=sc.nextInt();
    	}
    	for(int i=0;i<a.length;i++)
    	{
    		if(a[0]==a[a.length/2])
    		{
    			//System.out.println("100");
    			flag=1;
    		}
    		else
    		{
    			flag=0;
    		}
    		
    	}
    	if(flag==1)
    	{
    		System.out.println("100");
    	}
    	else
    	{
    		System.out.println(a[0]);
    	}
    }
    
	}

}
