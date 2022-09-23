package abstractInterface;
abstract class Animal {
	abstract void cats();
	abstract void dogs();
	
}
class Cats extends Animal {

	@Override
	void cats() {
		// TODO Auto-generated method stub
		System.out.println("cats meow...");
	}

	@Override
	void dogs() {
		// TODO Auto-generated method stub
		
	}
}
	class Dogs extends Animal {

		@Override
		void cats() 
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		void dogs()
		{
			// TODO Auto-generated method stub
			System.out.println("Dog barks....");
		}
		
	}
	

public class AnimalsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ob,ob1;
		ob=new  Cats();
		ob.cats();
		
		ob1=new  Dogs();
		ob1.dogs();

	}

}
