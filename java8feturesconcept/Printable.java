package java8feturesconcept;

public interface Printable {
	float PI=3.14f;
	void print();
	static void square(int x)
	{
		System.out.println("square :"+(x*x));
	}
	default int cube(int a)
	{
		return a*a*a;
		
	}

}
