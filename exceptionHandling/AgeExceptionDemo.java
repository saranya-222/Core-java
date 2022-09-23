package exceptionHandling;
public class AgeExceptionDemo {
	public static void calc(int age)throws CustomException
	{
		if(age>=18)
		{
			System.out.println("Eligible to vote...");
		}
		else throw new CustomException("Ineligible to vote...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			calc(9);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Rest of the code...");

	}

}
