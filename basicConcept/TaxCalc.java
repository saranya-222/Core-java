package basicConcept;
import java.util.Scanner;
public class TaxCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int salary; 
       double tax;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the salary");
       salary=s.nextInt();
       tax=0.12*salary;
       System.out.println("The Tax amount on Salary is...."+tax);
       
	}

}
