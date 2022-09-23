package multithreadingConcept;

public class AccountDanger implements Runnable {
    private AccountSynchro s=new AccountSynchro();
    
	public static void main(String[] args) {
		AccountDanger d=new AccountDanger();
		Thread t1=new Thread(d);
		Thread t2=new Thread(d);
		t1.setName("Ram");
		t2.setName("Anu");
		t1.start();
		t2.start();
	}
		@Override
		public void run() {
			for(int i=0;i<5;i++)
			{
				makeWithdraw(1000);
			}
			
		}	
		
				
       
	

	

	private  synchronized void makeWithdraw(int amount) {
		// TODO Auto-generated method stub
		if(s.getBalance()>=amount)
		{
			
			System.out.println(Thread.currentThread().getName()+" is going to withdraw");
			s.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+" completes withdraw :"+s.getBalance());
		}
		else
		{
			System.out.println("not enough balance for "+Thread.currentThread().getName()+ " Balance :"+s.getBalance());
		}
		
	}
	}

	
