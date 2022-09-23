package multithreadingConcept;

public class AccountSynchro {
	 private int balance=5000;
	 public int getBalance()
	 {
		return balance;
		 
	 }
	public void withdraw(int amount)
	{
		balance=balance-amount;
	}
	private void getter() {
		// TODO Auto-generated method stub

	}

}
