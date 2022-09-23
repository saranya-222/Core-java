package basicConcept;
import java.io.*;
public class SubBuffer {

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
        int a,b;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the numbers...");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        System.out.println("Add="+(a+b));
        
	}

}
