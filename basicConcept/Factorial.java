package basicConcept;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int n,fact=1;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the required number...");
	 n=sc.nextInt();
		// TODO Auto-generated method stub
		for(int i=n;i>=1;i--)
		{
           fact=fact*i;
	    }
		System.out.println("Factorial of a given number is..."+fact);

}
}
