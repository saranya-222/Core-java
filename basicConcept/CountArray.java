package basicConcept;
import java.util.Scanner;
public class CountArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,p=0,n=0,z=0;
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
			if(a[i]>0)
			{
				p++;
			}
			else if(a[i]<0)
			{
				n++;
			}
			else
			{
				z++;
			}
		}
		System.out.println("count of positive numbers...."+p);
		System.out.println("count of negative numbers..."+n);
		System.out.println("count of zeros..."+z);


	}

}
