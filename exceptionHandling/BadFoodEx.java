package exceptionHandling;
import java.util.Scanner;
public class BadFoodEx {
 public void check(String fruit) throws BadFoodException
 {
	 if(fruit.equalsIgnoreCase("mango"))
		 System.out.println("I like "+fruit);
	 else throw new BadFoodException("I don't like "+fruit);
 }

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the fruit name....");
    String h=sc.nextLine();
    BadFoodEx ob=new BadFoodEx();
    try {
		ob.check(h);
	} catch (BadFoodException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println("Rest of the code.....");
	}

}
