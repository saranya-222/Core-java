package basicConcept;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c_age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of the candidate.....");
		c_age=sc.nextInt();
		if(c_age>=18)
		{
			System.out.println("Eligible for License");
		}
		else
		{
			System.out.println("Ineligible  for applying License");
		}
		

	}

}
