package basicConcept;
import java.util.Scanner;
public class InterestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount,years,rate;
		double Interest;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the principal amount");
		amount=a.nextInt();
		System.out.println("Enter the number of years.....");
		years=a.nextInt();
		System.out.println("Enter the rate of interest....");
		rate=a.nextInt();
		Interest=(amount*years*rate)/100;
		System.out.println("Simple Interest is..."+Interest);
		
		

	}

}
