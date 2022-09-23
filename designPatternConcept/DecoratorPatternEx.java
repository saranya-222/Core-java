package designPatternConcept;

import java.util.Scanner;

interface Food
 {
	 public String prepareFood();
	 public double price();
 }
 class VegFood implements Food
 {

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return "Complimentary food : Onion and pickle\n";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 0;
	}
 }
	abstract class FoodDecorator implements Food
	{
       private Food newfood;
       public FoodDecorator(Food newfood)
       {
    	   super();
    	   this.newfood=newfood;
       }
		@Override
		public String prepareFood() {
			// TODO Auto-generated method stub
			
			return newfood.prepareFood()+"Chicken Grill";
		}

		@Override
		public double price() {
			// TODO Auto-generated method stub
			return newfood.price()+ 250;
		}
		
	}
	class ChineseFood extends FoodDecorator
	{

		public ChineseFood(Food newfood) {
			super(newfood);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String prepareFood() {
			// TODO Auto-generated method stub
			return super.prepareFood()+"Fried rice and Chicken Barbeque";
		}

		@Override
		public double price() {
			// TODO Auto-generated method stub
			return super.price()+300;
		}
		
	}
	class NonVegFood extends FoodDecorator
	{

		public NonVegFood(Food newfood) {
			super(newfood);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String prepareFood() {
			// TODO Auto-generated method stub
			return super.prepareFood()+"Fried rice and Chicken Barbeque";
		}

		@Override
		public double price() {
			// TODO Auto-generated method stub
			return super.price()+300;
		}
		
	}
	
public class DecoratorPatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("\n 1.veg food\n2.Non Veg food\n3.Chinese food\n4.Exit");
			System.out.println("Enter the required choice....");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				VegFood f=new VegFood();
				System.out.println("Selected food :"+f.prepareFood());
				System.out.println("Food price :Rs."+f.price());
				break;
			case 2:
				Food f1=new NonVegFood (new VegFood());
				System.out.println("Selected food :"+f1.prepareFood());
				System.out.println("Food price :Rs."+f1.price());
				break;
			case 3:
				Food f2=new ChineseFood(new VegFood());
				System.out.println("Selected food :"+f2.prepareFood());
				System.out.println("Food price :Rs."+f2.price());
				break;
				
			default :System.out.println("No other food is available....");
			
				
			}
			
		}while(choice!=4);
	}

}
