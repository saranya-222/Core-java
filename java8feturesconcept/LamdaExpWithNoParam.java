package java8feturesconcept;
@FunctionalInterface
interface LamdaEx {
	public String say();
	
}

public class LamdaExpWithNoParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LamdaEx ob=()->{return "Hello World";

	};
	System.out.println(ob.say());

}
}
