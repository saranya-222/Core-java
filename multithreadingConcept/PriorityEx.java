package multithreadingConcept;

public class PriorityEx extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       PriorityEx t=new PriorityEx();
       PriorityEx t2=new PriorityEx();
       t.setName("Thread 1");
       t2.setName("Thread 2");
       t.setPriority(Thread.NORM_PRIORITY);
       t2.setPriority( Thread.MAX_PRIORITY);
       t.start();
       t2.start();
       
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread name  :"+getName()+" Thread Priority :"+getPriority());
	}

}
