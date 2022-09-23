package exceptionHandling;

public class FinalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("case 1: Where exception doesn't occur...");
    try
    {
    	String s="Finally Demo";
    	System.out.println(s.length());
    }
    catch(NullPointerException e)
    {
    	e.printStackTrace();
    }
    finally
    {
    	System.out.println(" case 1 :It is always executed...");
    }
    System.out.println("case 1 : rest of the code...");
    System.out.println("\n case 2: where exception occurs and can be handled...");
    try
    {
    	String s="abc";
    	System.out.println(Integer.parseInt(s));
    }
    catch(NumberFormatException e)
    {
    	e.printStackTrace();
    }
    finally
    {
    	System.out.println("case 2 :It will always executed...");
    }
    System.out.println("case 2 :rest of the code...");
    System.out.println("\n case 3 :where exception occured and not handled....");
    try
    {
    	int i=100/0;
    	System.out.println(i);
    	
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
    	e.printStackTrace();
    }
    finally
    {
    	System.out.println("case 3 : It will always executed...");
    }
    System.out.println("case 3 :Rest of the code....");
	}

}
