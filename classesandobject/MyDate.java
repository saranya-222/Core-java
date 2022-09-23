package classesandobject;

public class MyDate {
	int dd,mm,yyyy;
	public MyDate()
	{
		dd=22;
		mm=12;
		yyyy=2001;
		
	}
	public MyDate(int dd,int mm,int yyyy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;
	}
	public void display()
	{
		System.out.println("Date of birth:"+dd+"/"+mm+"/"+yyyy);
	}

}
