package practicals;
@FunctionalInterface
 interface SquareCalc
 {
	 int square(int a);
 }

public class LamdaPrac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareCalc ob=(a)->
		{
			return a*a;
		};
		System.out.println("Square :"+ob.square(5));

	}
}
