package multithreadingConcept;

public class Thread1Ex extends Thread {
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread executing :"+getName());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1Ex c=new Thread1Ex();
		c.setName("Thread 1");
		c.start();
	
		Thread1Ex b=new Thread1Ex();
		b.setName("Thread 2");
		b.start();
		System.out.println("Hello");
		

	}

}
