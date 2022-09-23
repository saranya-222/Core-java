package basicConcept;
import java.io.*;
public class BufInterestCalc {

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		int amount,n,rate;
		double interest;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Principal amount...");
		amount=Integer.parseInt(br.readLine());
		System.out.println("Enter the no of years...");
		n=Integer .parseInt(br.readLine());
		System.out.println("Enter the rate of interest...");
		rate=Integer.parseInt(br.readLine());
		interest=(amount*n*rate)/100;
		System.out.println("Simple Interest..."+interest);
		
	}

}
