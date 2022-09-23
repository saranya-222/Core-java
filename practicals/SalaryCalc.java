package practicals;
import java.util.Scanner;
public   class SalaryCalc {
	 static String binary=" ";
	 public static String toBinary(int x)
	 {
		while(x>0)
		{
			binary=(x%2)+binary;
			x/=2;
		}
		return binary;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number....");
     x=sc.nextInt();
     System.out.println(SalaryCalc.toBinary(x));
	}

}
