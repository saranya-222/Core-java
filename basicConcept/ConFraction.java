package basicConcept;
import java.util.Scanner;
public class ConFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value...");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+(i/i+1);
			System.out.print(i+"/"+(i+1));
			if(i<n)
			{
				System.out.print(" + ");
			}
		}
		System.out.println(" = "+sum);

	}

}
