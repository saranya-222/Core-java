package basicConcept;
import java.util.Scanner;
public class ArrayFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double sum=0,temp=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total num...");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		   temp=temp*i;
		   sum=sum + (i/temp);
		   System.out.print(i+"/"+i+"!");
		   if(i<n)
			{
				System.out.print(" + ");
			}
		}
		
		System.out.println(" = "+sum);

	}

}
