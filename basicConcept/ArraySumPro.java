package basicConcept;
import java.util.Scanner;
public class ArraySumPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,sum=0,pro=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array...");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements are....");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
			else if(a[i]%2!=0)
			{
				pro=pro*a[i];
			}
		}
		System.out.println("Sum of even numbers are...."+sum);
		System.out.println("product of odd numbers are..."+pro);

	}

}
