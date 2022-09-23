package basicConcept;
import java.util.Scanner;
public class DifSignSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total num...");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        	if(i%2==0)
        	sum=sum-i;
        	else 
        		sum=sum+i;
        	System.out.print(i);
        	if(i<n)
        	if(i%2==0)
        		System.out.print(" + ");
        	else
        		System.out.print(" - ");
        }
        System.out.println(" = "+sum);
	}

}
