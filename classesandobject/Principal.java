package classesandobject;
import java.util.Scanner;
public class Principal {
	double a,p,r,n;
	String name;

	Scanner s=new Scanner(System.in);
	Principal()
	{
		a=0;
		p=0;r=0;n=0;
		name="";
	}
	public void accept()
	{
		System.out.println("Enter the depositor name.....");
		name=s.nextLine();
		System.out.println("Enter the  principal amount....");
		p=s.nextDouble();
		System.out.println("Enter the no.of years...");
		n=s.nextDouble();
		
	}
	public void amount()
	{
		if(n<1)
		{
			r=9;
		//	a=p*Math.pow(1+(r/100) ,  2*n);
		}
		else if(n>=1&&n<=3)
		{
			r=9.25;
		//	a=p*Math.pow(1+(r/100) ,  2*n);
		}
		else if(n>3&&n<=5)
		{
			r=9.5;
		//	a=p*Math.pow(1+(r/100) ,  2*n);
		}
		else if(n>5)
		{
			r=9.75;
			//a=p*Math.pow(1+(r/100) ,  n);
		}
		a=p*Math.pow(1+(r/100) ,  n);
		System.out.println("DEPOSITOR NAME......"+name);
		System.out.println("The accumulated amount is.... Rs."+String.format("%.02f", a));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal ob=new Principal();
		ob.accept();
		ob.amount();

	}

}
