package basicConcept;

import java.util.Scanner;

public class ArrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,max=0;
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
			if(max<a[i])
			{
				max=a[i];
			}
		
		}
		int min=a[0];
		for(int i=0;i<size;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("The maximum number among this  array is..."+max);
		System.out.println("The minimum number among this array is..."+min);

	}

}
