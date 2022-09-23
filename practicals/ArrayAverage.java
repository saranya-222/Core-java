package practicals;
import java.util.Scanner;
public class ArrayAverage {
	float sum=0;
	public float avgArray(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
			
		}
		sum=sum/a.length;
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array...");
		n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		int a[]=new int[20];
		System.out.println("Enter the array elements...");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<0)
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
		}
		ArrayAverage ob=new ArrayAverage();
		
		System.out.println("Average of the array elements are  :"+String.format("%.2f",ob.avgArray(a, n)));
		
		

	}

}
