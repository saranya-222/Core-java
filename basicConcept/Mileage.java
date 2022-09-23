package basicConcept;
import java.util.Scanner;
public class Mileage {
int m;
	 public int findMileage(int cc)
	 {
		 if(cc>100&&cc<=125)
		 {
			m=75; 
		 }
		 else if(cc>125&&cc<=135)
		 {
			m=70; 
		 }
		 if(cc>135&&cc<=150)
		 {
			m=60; 
		 }
		 if(cc>150&&cc<=200)
		 {
			m=50; 
		 }
		 if(cc>200&&cc<220)
		 {
			m=35; 
		 }
		 return m;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cubic capacity of the bike...");
		int cc=sc.nextInt();
		if(cc>220)
		{
			System.out.println("Number is too large...");
			System.exit(0);
		}
		else if(cc<100)
		{
			System.out.println("Number is too small...");
			System.exit(0);
		}
		Mileage m=new Mileage();
		int s=m.findMileage(cc);
		System.out.println("Mileage of the bike according to the CC..."+s);
		

	}

}
