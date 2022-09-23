package abstractInterface;
  abstract class  Test {
	  Test()
	  {
		  System.out.println("This is a constructor of abstract class....");
	  }
	  abstract void a_method();
	  void b_method()
	  {
		 System.out.println("This is a non-abstract method......"); 
	  }
	 
 }
  class A extends Test{

	@Override
	void a_method() {
		// TODO Auto-generated method stub
		System.out.println("This is a abstract method....");
		
	}
	  
  }
public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      A ob=new A();
      ob.a_method();
      ob.b_method();
	}

}
