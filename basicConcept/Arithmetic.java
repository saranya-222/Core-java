package basicConcept;
import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the a");
		a=s.nextInt();
		System.out.println("Enter the b");
		b=s.nextInt();
		System.out.println("Addition...."+(a+b));
		System.out.println("Subtraction...."+(a-b));
		System.out.println("Multiplication...."+(a*b));
		System.out.println("Division...."+(a/b));
		System.out.println("Modulus...."+(a%b));

	}

}
