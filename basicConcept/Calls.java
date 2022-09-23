package basicConcept;
import java.io.*;
public class Calls {

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
     int call,c_amount = 0;
     BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the number of calls...");
     call=Integer.parseInt(b.readLine());
     if(call<200)
     {
    	c_amount=1*call;
     }
     else if(call>200)
     {
    	 c_amount=3*call;
     }
     System.out.println("The total amount for the calls are .....Rs."+c_amount);
	}

}
