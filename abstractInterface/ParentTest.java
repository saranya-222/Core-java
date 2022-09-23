package abstractInterface;

 abstract class Parent {
	public abstract void  message();

}
class MessageA extends Parent{

	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is the first sub class.....");
		
	}
	
}
class MessageB extends Parent{
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is the second sub class....");
		
	}
	
}
public class ParentTest{
	public static void main(String h[])
	{
		Parent a,b;
		a=new MessageA();
		a.message();
		b=new MessageB();
		b.message();
	}
}