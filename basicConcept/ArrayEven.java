package basicConcept;
import java.util.Scanner;
public class ArrayEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array...");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements...");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
				
		}
		System.out.println("Even elements are...");
		for(int i=0;i<size;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		

	}

}
