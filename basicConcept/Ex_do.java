package basicConcept;
import java.util.Scanner;

public class Ex_do {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		char ch;
		Scanner d=new Scanner(System.in);
		do
		{
		System.out.println("Enter the two numbers...");
		a=d.nextInt();
		b=d.nextInt();
		System.out.println("Added..."+(a+b));
		System.out.println("Do you want to continue yes/no...");
		 ch=d.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
		

	}

}
