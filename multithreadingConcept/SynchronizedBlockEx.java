package multithreadingConcept;


	class PrintTable{
		 
		public void print(int n) 
		{
			synchronized(this)
			{
			for(int i=1;i<=10;i++)
			{
				try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(n*i);
			}
		}
	}
	}
	class Thread1 extends Thread {
		PrintTable p;

		public Thread1(PrintTable p) {
			this.p = p;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
          p.print(4);
		}
		
	}
	class Thread2 extends Thread {
		PrintTable p;

		public Thread2(PrintTable p) {
		
			this.p = p;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			p.print(7);
		}
		
	}
	public class SynchronizedBlockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTable p=new PrintTable();
		Thread1 t=new Thread1(p);
		Thread2 t1=new Thread2(p);
		t.start();
		t1.start();
		

	}

}
