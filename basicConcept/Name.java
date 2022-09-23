package basicConcept;
import java.util.Scanner;
public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name...");
		name=sc.next();
		for(int i=0;i<5;i++)
		{
			System.out.println(name);
		}
		

	}

}
