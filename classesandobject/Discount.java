package classesandobject;
import java.util.Scanner;
public class Discount extends Customer {
	double discount,finalBill,discountAmount;;
	public Discount(int id,String name,String prodName,float quantity,float price)
	{
	super( id, name, prodName, quantity, price);
	}	
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
		if(billAmount>=20000)
			discount=0.15;
		else if(billAmount>=15000&&billAmount<20000)
			discount=0.10;
		else if(billAmount>=10000&&billAmount<15000)
			discount=0.07;
		else 
			discount=0;
		 discountAmount=billAmount*discount;
		finalBill=billAmount-discountAmount;

	}
		@Override
		public void display() {
			// TODO Auto-generated method stub
			super.display();
			System.out.println("Discount amount :"+discountAmount);
			System.out.println("Final bill :"+finalBill);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Customer name.....");
		String name=sc.nextLine();
		System.out.println("Enter the customer id...");
		int id=sc.nextInt();
		
		System.out.println("Enter the product name....");
		sc.nextLine();
		String prodName=sc.nextLine();
		System.out.println("Enter the quantity....");
		float quantity=sc.nextFloat();
		System.out.println("Enter the price....");
		float price=sc.nextFloat();
		System.out.println("=======================================================");
		Discount ob=new Discount(id,name, prodName,quantity,price);
		ob.calculate();
		
		ob.display();

	}

}
