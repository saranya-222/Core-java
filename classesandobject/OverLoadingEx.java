package classesandobject;
import java.util.Scanner;
public class OverLoadingEx {

    public void add(int a,int b,int c)
    {
    	System.out.println("Addition="+(a+b+c));
    }
    public void  add(double a,double b)
    {
    	System.out.println("Addition="+(a+b));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingEx ob=new OverLoadingEx();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  values...");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double d=sc.nextDouble();
		double e=sc.nextDouble();
		ob.add(a, b,c);
		ob.add(d,e);
	}

}
