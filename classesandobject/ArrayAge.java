package classesandobject;
import java.util.Scanner;
public class ArrayAge {
	int sum=0;
    public int newArraySum(int a[],int age)
    {
    	for(int i=0;i<a.length;i++)
    		
    	{
    		if(a[i]>=18)
    		{
    		sum=sum+a[i];
    		}
    	}
		return sum;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the total no.of employees...");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid input....");
			System.exit(0);
		}
		int a[]=new int[n];
		System.out.println("Enter the ages of the employees....");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.println("Invalid input....");
				System.exit(0);
			}
		}
	
	  ArrayAge ob=new ArrayAge();
	 int sum= ob.newArraySum(a, n);
	 System.out.println("Sum of the age :"+sum);

	}

}
