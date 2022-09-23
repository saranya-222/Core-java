package basicConcept;
import java.util.Scanner;
public class SquareFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value...");
		n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        	System.out.print(i+"/"+i*i);
        	sum=sum+(i/i*i);
        	if(i<n)
        	{
        		System.out.print(" + ");
        	}
        }
        System.out.println("= "+sum);
	}

}
