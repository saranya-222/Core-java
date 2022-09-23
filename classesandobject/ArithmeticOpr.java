package classesandobject;
import java.io.*;
public class ArithmeticOpr  {
	double a,b;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void input()throws NumberFormatException,IOException
	{
	System.out.println("Enter the value of a...");
	a=Double.parseDouble(br.readLine());
    System.out.println("Enter the value of b... ");
    b=Double.parseDouble(br.readLine());
	}
	public double add()
	{
		
		System.out.println("Addition="+(a+b));
		return(a+b);
	}
	public int sub()
	{
		
		System.out.println("Subtraction="+(a-b));
		return(int)(a+b);
	}
	public double multiple()
	{
		
		System.out.println("multiplication="+(a*b));
		return(a+b);
	}
	public void divide()
	{
		
		System.out.println("Division="+(a/b));
	
	}
	
	public void modulus()
	{
	
		System.out.println("modulus="+(a%b));
	
	}	
	
	
	

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		ArithmeticOpr obj=new ArithmeticOpr ();
		obj.input();
		obj.add();
		obj.sub();
		obj.multiple();
		obj.divide();
		obj.modulus();
		
           
	}

}
