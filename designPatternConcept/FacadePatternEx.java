package designPatternConcept;

import java.util.Scanner;

interface MobileShop
{
	public void mobileNo();
	public void price();
	
}
class Iphone implements MobileShop
{

	@Override
	public void mobileNo() {
		// TODO Auto-generated method stub
		System.out.println("Iphone6");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Rs:65000");
	}
	
}
class Samsung implements MobileShop
{

	@Override
	public void mobileNo() {
		// TODO Auto-generated method stub
		System.out.println("Samsung A21");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
	System.out.println("Rs:450000");	
	}
	
}
class BlackBerry implements MobileShop
{

	@Override
	public void mobileNo() {
		// TODO Auto-generated method stub
		System.out.println("Blackberry Z10");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
     System.out.println("Rs:80000");		
	}
	
}
class ShopKeeper
{
  private MobileShop Iphone,Samsung,BlackBerry;

public ShopKeeper() {
	super();
	Iphone=new Iphone();
	Samsung=new Samsung();
	BlackBerry=new BlackBerry();
	
}
public void iphoneSale()
{
	Iphone.mobileNo();
	Iphone.price();
}
public void samsungSale()
{
  Samsung.mobileNo();
  Samsung.price();
}
public void blackBerrySale()
{
	BlackBerry.mobileNo();
	BlackBerry.price();
}
  
}
public class FacadePatternEx {

	public static void main(String[] args) {
		ShopKeeper shopkeeper=new ShopKeeper();
		int choice;
		Scanner sc=new Scanner(System.in);
		do
		{
         System.out.println("\n1.Iphone\n2.Samsung\n3.BlackBerry\n4.Exit\n");
         System.out.println("Enter the phone needed.....");
         choice=sc.nextInt();
         switch(choice)
         {
         case 1:
        	 shopkeeper.iphoneSale();
        	 break;
         case 2:
        	 shopkeeper.samsungSale();
        	 break;
         case 3:
        	 shopkeeper.blackBerrySale();
        	 break;
        	 
        default:System.out.println("No other mobile phones are available..");
        	 
         }
		}while(choice!=4);

	}

}
