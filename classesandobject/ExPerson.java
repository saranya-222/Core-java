package classesandobject;

public class ExPerson {
	long id;
	String name;
	public ExPerson(long id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void display()
	{
		System.out.println("Customer name :"+name);
		System.out.println("Customer id :"+id);
	}

	
}
