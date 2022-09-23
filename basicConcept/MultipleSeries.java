package basicConcept;
import java.util.Scanner;
public class MultipleSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double m=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total num...");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			m=i*(i+1);
			System.out.print(i+"*"+(i+1));
			if(i<n)
				System.out.print(" + ");
		}
		System.out.print(" = "+m);

	}

}
