package basicConcept;
import java.util.Scanner;
public class SquareSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n...");
		n=sc.nextInt();
		System.out.println("The square series are....");
		for( int i=1;i<=n;i++)
		{
		
			int a=i*i;
			System.out.print(a+" ");
		}
		

	}

}
