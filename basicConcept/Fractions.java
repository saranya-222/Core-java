package basicConcept;
import java.util.Scanner;
public class Fractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double temp=1,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n value...");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
		 sum=sum+(temp/i);
		 System.out.print("1/"+i);
		 if(i<n)
			 System.out.print(" + ");
			
		}
		System.out.println("= "+sum);

	}

}
