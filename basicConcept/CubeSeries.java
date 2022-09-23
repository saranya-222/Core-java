package basicConcept;
import java.util.Scanner;
public class CubeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value...");
		n=sc.nextInt();
		System.out.println("The cube series are...");
		for(int i=1;i<=n;i++)
		{
			System.out.print(i*i*i+" ");
		}
		

	}

}
