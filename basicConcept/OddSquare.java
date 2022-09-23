package basicConcept;
import java.util.Scanner;
public class OddSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value...");
		n=sc.nextInt();
		System.out.println("The square series of odd numbers are...");
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i*i+" ");
			}
		}

	}

}
