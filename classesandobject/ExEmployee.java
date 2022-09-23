package classesandobject;

public class ExEmployee extends Person{
	int days;
	float amount,salary;
	public ExEmployee()
	{
		super();
		days=100;
		amount=1800;
		
	}
	public ExEmployee(int id,String name,MyDate d,int days,float amount)
	{
		super(id,name,d);
		this.days=days;
		this.amount=amount;
	}
	public void calculate()
	{
		salary=days*amount;
	}
	public void display()
	{
		super.display();
		System.out.println("Salary :"+salary);
	}

	
}
