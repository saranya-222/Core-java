package basicConcept;
import java.io.*;
public class BufMarksCalc {

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		int tam,eng,mat;
		double tot,percentage;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the tamil mark....");
        tam=Integer.parseInt(br.readLine());
        System.out.println("Enter the english mark....");
        eng=Integer.parseInt(br.readLine());
        System.out.println("Enter the maths mark....");
        mat=Integer.parseInt(br.readLine());
        tot=tam+eng+mat;
        percentage=tot/3;
        System.out.println("Total marks...."+tot);
        System.out.println("percentage...."+percentage);
	}

}
