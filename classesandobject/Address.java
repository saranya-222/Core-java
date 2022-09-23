package classesandobject;

public class Address { 
	String addLine,street,city;
	long pincode;
	public Address()
	{
		addLine="No.8A";
		street="1st cross street,Mahatma gandhi nagar,Sriperumbudur";
		city="Chennai";
		pincode=602105;
	}
	public Address(String addLine,String street,String city,long pincode )
	{
		this.addLine=addLine;
		this.street=street;
		this.city=city;
		this.pincode=pincode;
	}
	public void output()
	{
		System.out.println("Adddress...\t"+addLine+","+street+","+city+","+pincode);
		
	}

}
