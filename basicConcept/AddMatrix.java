
package basicConcept;
import java.util.Scanner;
public class AddMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array elements for a...");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the array elements for b.....");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix a");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
		           System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	  System.out.println("Matrix b");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Addition of two matrix...");
		for(int i=0;i<3;i++)
		{
		  for(int j=0;j<3;j++)
		  {
			  c[i][j]=a[i][j]+b[i][j];
		  }
		}
		System.out.println("Added...");
	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
