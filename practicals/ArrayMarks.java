package practicals;
import java.util.Scanner;
public class ArrayMarks {
	double above_average=0;
	int marks=0;
   public void averageMarks(int a[],int num)
   {
	   for(int i=0;i<a.length;i++)
	   {
		   marks=marks+a[i];
	   }
	   above_average=marks/a.length;
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]>=above_average)
		   {
			   System.out.println(a[i]);
		   }
	   }
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array...");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid input");
		    System.exit(0);
		}
		int a[]=new int[n];
		System.out.println("Enter the array elements....");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<0)
			{
				System.out.println("Invalid input");
			    System.exit(0);
			}
		}
		ArrayMarks m=new ArrayMarks();
		m.averageMarks(a, n);

	}

}
