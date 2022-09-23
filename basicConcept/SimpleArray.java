package basicConcept;
import java.util.Scanner;
public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array...");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array values ....");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("the array values are...");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
		

	}

}
