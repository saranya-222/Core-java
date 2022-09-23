package multithreadingConcept;

public class Thread2Ex implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2Ex b=new Thread2Ex();
		Thread t=new Thread(b);
		t.setName("Thread 1");
		
		Thread th =new Thread(b);
	    th.setName("thread 2");
	    th.start();
	   
       

	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Executing thread :"+Thread.currentThread().getName());
		}
	}

}
