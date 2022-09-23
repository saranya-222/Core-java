package classesandobject;

public class Customer extends ExPerson {
	String prodName;
	float quantity,price;
	double billAmount;
	public Customer(int id,String name,String prodName,float quantity,float price)
	{
		super(id,name);
		this.prodName=prodName;
		this.quantity=quantity;
		this.price=price;
	}
	public void calculate()
	{
		
		billAmount=quantity*price;
	}

	public void display()
	{
		super.display();
		System.out.println("The billAmount :"+billAmount);
		
		
	}

	
}
