package practicals;
import java.util.Scanner;
public class ArrayDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int flag=0;
		int n;
		System.out.println("Enter the size of an array....");
		n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid array size...");
			System.exit(0);
		}
		int a[]=new int[n];
		System.out.println("Enter the array elements...... ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<0)
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
			
		}
		for(int i=1;i<a.length;i++)
		{
			if(a[i]==a[i-1]+4||a[i]==a[i-1]+4)
			{
				flag=1;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("\n1");
		}
		else
		{
			System.out.println("\n0");
		}

	}

}
