package classesandobject;
import java.util.Scanner;
public class Factorial {
	int n,size=0,sum=0,temp,s,fact,c=1,j=0;
	int a[]=new int[5];
	public Factorial(int n)
	{
		this.n=n;
		temp=n;
	}
	public void calculate()
	{
	while(n>0)
	{
		s=n%10;
	    sum=s;
	    fact=s;
	    size++;
	    for(int i=fact;i>=1;i--)
	    {
	    	c=c*i;
	    	
	    	
	    }
	   
	   
	    /*for( j=1;j<=size;j++)
	    {
	    a[j]=c;
	  //  System.out.println(c);
	    }*/
	    
	    temp=temp/10;
	   
	}
	}
	public void display()
	{
		System.out.println("number :"+n);
		System.out.println("Reverse:"+sum);
		System.out.println(fact);
		System.out.println("c  :"+c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nummber....");
		int n=sc.nextInt();
		Factorial f=new Factorial(n);
		
		f.calculate();
		f.display();
		

	}

}
