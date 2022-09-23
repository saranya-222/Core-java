package multithreadingConcept;

public class JoinEx  extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	  for(int i=0;i<=5;i++)
	  {
		  try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println(i);
	  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinEx t1=new JoinEx();
		JoinEx t2=new JoinEx();
		JoinEx t3=new JoinEx();
       t1.start();
       try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	t2.start();
	t3.start();

}
}