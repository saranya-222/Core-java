package basicConcept;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,t=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number...");
		n=sc.nextInt();
		t=n;
		while(t>0)
		{
			int r=t%10;
			sum=sum*10+r;
			t=t/10;
			
			
		}
		System.out.println("Reverse......"+sum);
     if(sum==n)
     {
    	 System.out.println("Palindrome number...");
    	 
     }
     else
     {
    	 System.out.println("not a palindrome number...");
     }
	}

}
