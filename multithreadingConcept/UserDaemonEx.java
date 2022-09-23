package multithreadingConcept;

public class UserDaemonEx extends Thread {
 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 UserDaemonEx t1=new UserDaemonEx();
		  UserDaemonEx t2=new UserDaemonEx();
		  UserDaemonEx t3=new UserDaemonEx();
		  t3.setDaemon(true);
		  t1.start();
		  t2.start();
		  t3.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	   if(Thread.currentThread().isDaemon())
	   {
		   System.out.println("Daemon thread");
	   }
	   else
	   {
		   System.out.println("User thread");
	   }
	}

}
	