package basicConcept;
import java.io.*;
public class TaxCal {

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		double amount,tax = 0;
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the salary....");
		amount=Double.parseDouble(b.readLine());
        if(amount<25000)
        {
        	tax=0.1*amount;
        }
        else if(amount>25000)
        {
        	tax=0.15*amount;
        }
        System.out.println("The tax amount is....."+tax);
	}

}
