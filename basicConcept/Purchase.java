package basicConcept;
import java.io.*;
public class Purchase {

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
    double p_amount,discount;
    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the purchase amount....");
    p_amount=Double.parseDouble(b.readLine());
    if(p_amount>=10000)
    {
     discount=0.1*p_amount;	
    }
    else 
    {
    	discount=0.02*p_amount;
    }
    System.out.println("Discount on purchase...... "+discount);
	}

}
