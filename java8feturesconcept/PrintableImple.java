package java8feturesconcept;

public class PrintableImple implements Printable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		PrintableImple m=new PrintableImple();
		Printable.square(7);
		m.print();
		c=m.cube(9);
       System.out.println("cube :"+c);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		float r=10;
		float circle=PI*r*r;
		System.out.println("Area of a circle :"+circle);
		
	}

}
