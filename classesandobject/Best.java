package classesandobject;

import java.util.Scanner;

public class Best {
	String name;
	long phone;
	int n;
	double amount,tax,bill;
	Scanner sc=new Scanner(System.in);
	
	Best()
	{
		name="";
		phone=0;
		n=0;
		tax=0;
		amount=0;bill=0;
	}
	public void accept()
	{
		System.out.println("Enter the customer name...");
		name=sc.nextLine();
		System.out.println("Enter the phone number...");
		phone=sc.nextLong();
		System.out.println("Enter the no.of calls...");
		n=sc.nextInt();
	}
	public void billing()
	{
		if(n>100&&n<300)
		{
			amount=n*0.80;
			
		}
		else if(n>=300&&n<500)
		{
			amount=n*1.25;
			
			
		}
		else if(n>=500)
		{
			amount=n*2.50;
			
			
		}
		else 
		{
			amount=0;
		}
		tax=0.12*amount;
		bill=amount+tax;
		System.out.println("CUSTOMER NAME....."+name);
		System.out.println("PHONE NUMBER....."+phone);
		System.out.println("TAX AMOUNT...."+tax);
		System.out.println("FINAL BILLING...."+bill);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Best b=new Best();
		b.accept();
		b.billing();

	}

}
