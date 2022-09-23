package abstractInterface;

 abstract class Bank {
	public abstract void getBalance();

}
class BankA extends Bank{
    int deposit=100;
	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("The amount deposited  in a Bank A :$"+deposit);
		
	}
	
}
class BankB extends Bank{
   int deposit=150;
	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("The amount deposited in a bank B :$"+deposit);
		
	}
	
}
class BankC extends Bank {
int deposit=200;
	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("The amount deposited in a bank C :$"+deposit);
		
	}
	
}
public class BankTest {
	public static void main(String h[]) {
		Bank a,b,c;
		a=new BankA();
		a.getBalance();
		b=new BankB();
		b.getBalance();
		c=new BankC();
		c.getBalance();
}
}