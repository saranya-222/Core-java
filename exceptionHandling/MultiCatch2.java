package exceptionHandling;

public class MultiCatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
    	try
    	{
    		int a[]=new int[4];
    		int i=20/0;
    		a[9]=i;
    	}
    	catch(ArithmeticException |ArrayIndexOutOfBoundsException e)
    	{
    		e.printStackTrace();
    	}
    
	}
}
	
