package exceptionHandling;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[4];
		try
		{
		a[8]=70/0;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest....");
}
}
