package exceptionHandling;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i=100;
     try
     {
    	 i=100/0;
    	 System.out.println(i);
     }
     catch(Exception e)

	{
    	 System.out.println(e);
    	 
	}
     System.out.println("Rest of the code...");
	 
	}

}
