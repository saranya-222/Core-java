package basicConcept;

import java.util.Scanner;

public class AvgOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,sum=0,e=0,sum1=0,o=0;;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array...");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the number of array elements...");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The array elements are....");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<size;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
				e++;
			}
			
			else
			{
				sum1=sum1+a[i];
				o++;
			}
		}
	
		System.out.println("The average of even numbers are..."+(double)(sum/e));
		System.out.println("The average of odd numbers are..."+(double)(sum1/o));

	}

}
