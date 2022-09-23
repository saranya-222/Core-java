package basicConcept;
import java.io.*;
public class BufAreas {

	public static void main(String[] args)throws NumberFormatException,IOException{
		// TODO Auto-generated method stub
		double r,b,h;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius.....");
		r=Double.parseDouble(br.readLine());
		System.out.println("Enter the base...");
		b=Double.parseDouble(br.readLine());
		System.out.println("Enter the height....");
		h=Double.parseDouble(br.readLine());
		System.out.println("Area of the circle...."+(3.14*r*r));
		System.out.println("Area of a triangle...."+(0.5*b*h));
		

	}

}
