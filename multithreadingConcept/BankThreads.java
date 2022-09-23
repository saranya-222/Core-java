package multithreadingConcept;

  class Customer{
	  private int amount;
	synchronized void withdraw(int amount)
	{
		if(this.amount<amount)
		{
			System.out.println("Less balance");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("Withdarw completes");
	}
	synchronized void deposit( int amount)
	{
		System.out.println("Amount deposits");
		this.amount+=amount;
		System.out.println("Deposit completed... Balance : Rs."+this.amount);
		notify();
	}
  }
	public class BankThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		new Thread	("Ravi"){
		public void run()
		{
			c.withdraw(10000);
		};
		}.start();
		new Thread	("manas"){
			public void run()
			{
				c.deposit(10000);
			};
			}.start();
			


	}

}
