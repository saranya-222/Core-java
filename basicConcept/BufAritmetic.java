package basicConcept;
import java.io.*;
public class BufAritmetic {

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		int a,b;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of a");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter the value of b");
		b=Integer.parseInt(br.readLine());
		System.out.println("Addition...."+(a+b));
		System.out.println("Subtraction...."+(a-b));
		System.out.println("Multiplication...."+(a*b));
		System.out.println("Division...."+(a/b));
		System.out.println("Modulus...."+(a%b));

	}

}
