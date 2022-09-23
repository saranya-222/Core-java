package designPatternConcept;

class SingleObject
{
	//creating instance of a class.
	private static SingleObject obj=new SingleObject();
	//making private constructor so that this class cannot be instantiate
    private SingleObject() {
		
	}

	//get the object available
	public static SingleObject getObj() {
		return obj;
	}
	public void show()
	{
		System.out.println("Accessing methods using singleton object");
	}
	
}

public class SingletonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleObject obj= SingleObject.getObj();
		obj.show();

	}

}
