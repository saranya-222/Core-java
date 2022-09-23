package basicConcept;
import java.util.Scanner;
public class SwitchArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a");
		a=sc.nextInt();
		System.out.println("Enter the b");
		b=sc.nextInt();
		System.out.println("Enter your choice...\n 1.Add\n2.Sub\n3.Multiply\n4.Divide");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Addition:"+(a+b));
		break;
		case 2:System.out.println("Subtraction:"+(a-b));
		break;
		case 3:System.out.println("Multiplication:"+(a*b));
		break;
		case 4:System.out.println("Division:"+(a/b));
		break;
		default :System.out.println("Invalid choices..");
		
		}
	}

}
