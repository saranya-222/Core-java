package basicConcept;
import java.util.Scanner;
public class MarksCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int tam,eng,mat,tot,percentage;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the tamil marks....");
     tam=s.nextInt();
     System.out.println("Enter the English mark....");
     eng=s.nextInt();
     System.out.println("Enter the maths mark....");
     mat=s.nextInt();
     tot=tam+eng+mat;
     percentage=tot/3;
     System.out.println("Total marks..."+tot);
     System.out.println("Percentage..."+percentage);
     
     
	}

}
