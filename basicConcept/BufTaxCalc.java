package basicConcept;
import java.io.*;
public class BufTaxCalc {

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		double salary,tax;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the salary....");
		salary=Double.parseDouble(br.readLine());
		tax=0.12*salary;
		System.out.println("Tax amount...."+tax);
		

	}

}
