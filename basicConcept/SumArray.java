package basicConcept;
import java.util.Scanner;
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements...");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];	
		}
		System.out.println("sum of array elements ="+sum);

	}

}
