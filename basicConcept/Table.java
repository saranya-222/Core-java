package basicConcept;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the table number...");
		n=sc.nextInt();
		System.out.println("Table of " +n+"\n\n");
		for(int i=1;i<=10;i++)
		{
			f=n*i;
			System.out.println(n+"*"+i+"="+f);
		}
		

	}

}
