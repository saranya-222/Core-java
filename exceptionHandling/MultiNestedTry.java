package exceptionHandling;

public class MultiNestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			try
			{
				String s ="abc";
				System.out.println(Integer.parseInt(s));	
			}
			catch(NumberFormatException e)
			{
				e.printStackTrace();
			}
			try
			{
				String s=null;
				System.out.println(s.length());
			}
			catch(NullPointerException e)
			{
				e.printStackTrace();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
