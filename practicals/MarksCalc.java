package practicals;
import java.util.Scanner;
public class MarksCalc {
	int cleared[]=new int[20];
	public void clearedStage1(int a[],int size)
	{
		for(int i=0;i<size;i++)
		{
			cleared[i]=a[i];
			/* if(cleared[i]==0)
			   {
				   System.out.println("Student id of cleared student ...."+0);
			   }
			 else
			 {
		   System.out.println(cleared[i]);	
			 }*/
		}
		System.out.println("Student id of cleared student...");
		for(int i=0;i<size;i++)
		{
			System.out.println(cleared[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int cleared[]=new int[10];
		int count=0;
		
		System.out.println("Enter the total number of elements... ");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		int s[]=new int[n];
		int[] c=new int[n];
		int sql[]=new int[n];
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print("Student id :");
			s[i]=sc.nextInt();
			if(s[i]<0)
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
			System.out.print("C_programming marks :");
			c[i]=sc.nextInt();
			
		
			
			if(c[i]<0)
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
			else
			System.out.print("Sql marks :");
			sql[i]=sc.nextInt();
			if(sql[i]<0)
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
			if(c[i]>=70&&sql[i]>=70)
			{
				cleared[i]=s[i];
				count++;
			}
			
			
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print("Student id :"+s[i]);
			System.out.print("\nC_programming marks :"+c[i]);
			System.out.print("\nSql marks :"+sql[i]);
			System.out.println();
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println("Student id :"+cleared[i]);
		}
		
	
		
		
		
        MarksCalc ob=new MarksCalc();
          ob.clearedStage1(cleared, count);
		

	}

}
