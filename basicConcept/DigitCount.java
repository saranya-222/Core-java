package basicConcept;
import java.util.Scanner;
public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number...");
		n=sc.nextInt();
		while(n>0)
		{
			int temp=n%10;
			sum=sum+temp;
			n=n/10;
		}
		System.out.println("Sum of digits..."+sum);

	}

}
